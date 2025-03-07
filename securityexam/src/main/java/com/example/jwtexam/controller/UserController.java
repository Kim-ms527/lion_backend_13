package com.example.jwtexam.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/api/mypage")
    public String mypage(){
        return "home";
    }
    @GetMapping("/loginform")
    public String loginform(){
        return "loginform";
    }
}
