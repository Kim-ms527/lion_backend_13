package com.example.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hi(){
        return "hello spring!!";
    }



    @GetMapping("/")
    public String index(){
        return "처음 페이지 입니다.";
    }

    @GetMapping("/test")
    public String test(){
        return "test 페이지입니다.";
    }

    @GetMapping("/carami")
    public String carami(){
        return "hello carami!!";
    }
}
