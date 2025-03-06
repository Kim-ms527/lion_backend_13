package com.example.jwtexam.jwt.filter;

import com.example.jwtexam.jwt.token.JwtAuthenticationToken;
import com.example.jwtexam.jwt.util.JwtTokenizer;
import com.example.jwtexam.security.dto.CustomUserDetails;
import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Slf4j
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    private final JwtTokenizer jwtTokenizer;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.info("JwtAuthenticationFilter  실행!!");
        //request로 부터 토큰을얻어와야함.
        String token = getToken(request);
        if(StringUtils.hasText(token)){
            try{
                Authentication authentication = getAuthentication(token);
                SecurityContextHolder.getContext().setAuthentication(authentication);

            }catch (Exception e){
                log.error("JWT Filter - Internal Error : {}", token,e);
                SecurityContextHolder.clearContext();
                throw new BadCredentialsException("JWT Filter - Internal Error");
            }
        }

        filterChain.doFilter(request,response);
    }
    private Authentication getAuthentication(String token){
        Claims claims = jwtTokenizer.parseAccessToken(token);
        String email = claims.getSubject();
        Long userId = claims.get("userId", Long.class);
        String name = claims.get("name", String.class);
        String username = claims.get("username", String.class);
        //권한
        List<GrantedAuthority> grantedAuthorities = getGrantedAuthorities(claims);

        //UserDetails
        CustomUserDetails customUserDetails = new CustomUserDetails(username, "", name, grantedAuthorities);
        return new JwtAuthenticationToken(grantedAuthorities, customUserDetails,null);
    }

    private List<GrantedAuthority> getGrantedAuthorities(Claims claims){
        List<String> roles = (List<String>) claims.get("roles");
        return roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }


    private String getToken(HttpServletRequest request){
        //헤더를 통해서 토큰을 넘겨줬다면...
        String authorization = request.getHeader("Authorization");
        if(StringUtils.hasText(authorization) && authorization.startsWith("Bearer ")){
            return authorization.substring(7);
        }

        //쿠키에 accessToken 이 있는지 찾아서 리턴
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if("accessToken".equals(cookie.getName())){
                    return cookie.getValue();
                }
            }
        }

        return null;
    }
}
