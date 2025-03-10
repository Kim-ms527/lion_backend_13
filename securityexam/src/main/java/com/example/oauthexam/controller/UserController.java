package com.example.oauthexam.controller;

import com.example.oauthexam.service.SocialLoginInfoService;
import com.example.oauthexam.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final SocialLoginInfoService socialLoginInfoService;
    private final PasswordEncoder passwordEncoder;

    @GetMapping("/loginform")
    public String loginform(){
        return "oauth/users/loginform";
    }

    @GetMapping("/registerSocialUser")
    public String registerSocialUser(){


        return "";
    }


}
