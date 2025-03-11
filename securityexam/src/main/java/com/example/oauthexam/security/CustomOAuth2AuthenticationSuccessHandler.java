package com.example.oauthexam.security;

import com.example.oauthexam.entity.Role;
import com.example.oauthexam.entity.SocialLoginInfo;
import com.example.oauthexam.entity.User;
import com.example.oauthexam.service.SocialLoginInfoService;
import com.example.oauthexam.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CustomOAuth2AuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    private final UserService userService;
    private final SocialLoginInfoService socialLoginInfoService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        //요청정보로부터 provider 얻어온다.
        //redirect-uri : "/login/oauth2/code/{registraionId}"
        String requestURI = request.getRequestURI();
        String provider = extractProviderFromUri(requestURI);

        //provider가 없는 경로가 요청되었다고 하는것은...  문제가 발생할 것!!
        if(provider == null){
            response.sendRedirect("/");
            return;
        }

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        DefaultOAuth2User defaultOAuth2User =(DefaultOAuth2User) auth.getPrincipal();

        String socialId = defaultOAuth2User.getAttributes().get("id").toString();
        String name = defaultOAuth2User.getAttributes().get("name").toString();

        Optional<User> userOptional = userService.findByProviderAndSocialId(provider, socialId);

        //이 사용자가 우리 서비스에 정보가 있는지 (이미 사용한 적이 있다면, User에 정보를 가지고 있었을거니까...
        if(userOptional.isPresent()){
            User user = userOptional.get();
            //이때 얻어낸 User 정보를 어디에 넣어줄까요??

            //CustomUserDetails  생성  -- 누가 사용하라고??
            CustomUserDetails customUserDetails = new CustomUserDetails(user.getUsername(),
                    user.getPassword(),
                    user.getName(),
                    user.getRoles()
                            .stream()
//                            .map(Role::getName)
                            .map(role -> "ROLE_"+role.getName())
                            .collect(Collectors.toList()));

            Authentication newAuth =
                    new UsernamePasswordAuthenticationToken(customUserDetails,null,customUserDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(newAuth);

            response.sendRedirect("/welcome");

        }else{
            //소셜로 아직 회원가입이 안되었을때..  무슨일을 해야할까요??  이 사용자가 우리 어플리케이션에 처음으로 들어왔을때..(소셜로그인으로)
            //사용자의 정보를 우리 서비스에도 남겨두고 싶다면...
            //소셜 로그인 정보 저장
            SocialLoginInfo socialLoginInfo = socialLoginInfoService.saveSocialLoginInfo(provider, socialId);

            response.sendRedirect("/registerSocialUser?provider="
                    +provider+"&socialId="+socialId+"&name="+name+"&uuid="+socialLoginInfo.getUuid());
        }

    }

    private String extractProviderFromUri(String uri) {
        //localhost:8080/login/oauth2/code/github
        if(uri == null || uri.isBlank()) {
            return null;
        }

        if(!uri.startsWith("/login/oauth2/code/")){
            return null;
        }

        // 예: /login/oauth2/code/github -> github
        String[] segments = uri.split("/");
        return segments[segments.length - 1];
    }
}
