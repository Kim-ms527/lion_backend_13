package com.example.jwtexam.jwt.util;

import io.jsonwebtoken.Claims;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class JwtTokenizerMain {
    public static void main(String[] args) {
        byte[] secretKey = "12345678901234567890123456789012".getBytes(StandardCharsets.UTF_8);
        JwtTokenizer jwtTokenizer = new JwtTokenizer("12345678901234567890123456789012", "12345678901234567890123456789012");

        String accessToken = jwtTokenizer.createAccessToken(1L, "test@test.com", "test", "testuser", Arrays.asList("ROLE_USER"));

        System.out.println(accessToken);
        String refreshToken = jwtTokenizer.createRefreshToken(1L, "test@test.com", "test", "testuser", Arrays.asList("ROLE_USER"));

        System.out.println(refreshToken);


        Claims claims = jwtTokenizer.parseToken(accessToken,secretKey);
        System.out.println(claims.getSubject());
        System.out.println(claims.get("username"));

        accessToken = "Bearer "+accessToken;
        Long userIdFromToken = jwtTokenizer.getUserIdFromToken(accessToken);
        System.out.println(userIdFromToken);
    }
}
