package com.example.jwtexam.jwt.util;

import java.util.Arrays;

public class JwtTokenizerMain {
    public static void main(String[] args) {
        JwtTokenizer jwtTokenizer = new JwtTokenizer("12345678901234567890123456789012", "12345678901234567890123456789012");

        String accessToken = jwtTokenizer.createAccessToken(1L, "test@test.com", "test", "testuser", Arrays.asList("ROLE_USER"));

        System.out.println(accessToken);
    }
}
