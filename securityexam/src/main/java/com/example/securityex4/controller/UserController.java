package com.example.securityex4.controller;

import com.example.securityex4.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    //회원가입폼 요청
    @GetMapping("/signup")
    public String signup(){return "exam4/users/signup";}

    //회원가입요청
    @PostMapping("/userreg")
    public String userReg(){return "redirect:/welcome";}


    //로그인 폼 요청
    @GetMapping("/loginform")
    public String loginform(){

        return "exam4/users/loginform";
    }

}
