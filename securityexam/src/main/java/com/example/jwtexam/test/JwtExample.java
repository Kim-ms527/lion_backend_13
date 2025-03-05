package com.example.jwtexam.test;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class JwtExample {
    public static void main(String[] args) {
//        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        String secret = "abcdefghijklmnopqrstuvwxzy123456";
        byte[] bytes = secret.getBytes(StandardCharsets.UTF_8);
        SecretKey secretKey = Keys.hmacShaKeyFor(bytes);

        //jwt 생성
        String jwt = Jwts.builder()
                .setIssuer("carami-app")
                .setSubject("carami123")
                .setExpiration(new Date(System.currentTimeMillis()+36000))
                .setAudience("carami-audience")
                .claim("role","ADMIN")
                .signWith(secretKey)
                .compact();

        System.out.println(jwt);
//        jwt = "eyJhbGciOiJIUzI1NiJ9.eyJpc3dddMiOiJjYXJhbWktYXBwIiwic3ViIjoiY2FyYW1pMTIzIiwiZXhwIjoxNzQxMTUzOTg4LCJhdWQiOiJjYXJhbWktYXVkaWVuY2UiLCJyb2xlIjoiQURNSU4ifQ.DSrG3Bn4_WNq3hgs_diyJ3Jrn1uHWKGmGB8w-BNe63c\n";

        //jwt 파싱, 검증
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(jwt)
                .getBody();

        System.out.println(claims.getExpiration());
        System.out.println(claims.getSubject());
        System.out.println(claims.getAudience());
    }
}
