package com.example.jwtexam.jwt.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.List;

@Component
public class JwtTokenizer {
    private final byte[] accessSecret;
    private final byte[] refreshSecret;

    public static final Long ACCESS_TOKEN_EXPIRE_COUNT=30*60*1000L;  //유지시간 30분
    public static final Long REFRESH_TOKEN_EXPIRE_COUNT=7*24*60*60*1000L;  //유지시간 7일

    public JwtTokenizer(@Value("${jwt.secretKey}") String accessSecret, @Value("${jwt.refreshKey}") String refreshSecret) {
        this.accessSecret = accessSecret.getBytes(StandardCharsets.UTF_8);
        this.refreshSecret = refreshSecret.getBytes(StandardCharsets.UTF_8);
    }

    private String createToken(Long id, String email, String name, String username, List<String> roles,
                               Long expire, byte[] secretKey){
        Claims claims = Jwts.claims().setSubject(email);
        //필요한 정보들을 저장
        claims.put("username", username);
        claims.put("name",name);
        claims.put("userId",id);
        claims.put("roles",roles);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime()+expire)) //expire 1000 * 60 * 60 1시간
                .signWith(getSigningKey(secretKey))
                .compact();
    }

    private static Key getSigningKey(byte[] secretKey){
        return Keys.hmacShaKeyFor(secretKey);
    }
    //ACCESS Token 생성
    public String createAccessToken(Long id, String email, String name, String username, List<String> roles){
        return createToken(id,email,name,username,roles,ACCESS_TOKEN_EXPIRE_COUNT,accessSecret);
    }
    //Refresh Token 생성
    public String createRefreshToken(Long id, String email, String name, String username, List<String> roles){
        return createToken(id,email,name,username,roles,REFRESH_TOKEN_EXPIRE_COUNT,refreshSecret);
    }
}
