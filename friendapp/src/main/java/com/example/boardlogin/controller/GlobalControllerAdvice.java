package com.example.boardlogin.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalControllerAdvice {

    @ModelAttribute("userInfo")
    public String getUserInfo(@CookieValue(name="userInfo", required = false)String name) {
        if(name != null)
            return name;
        return null; // 쿠키가 없으면 null 반환
    }
}