package com.example.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HelloController {
    @GetMapping("/homee")
    public String home() {
        return "home";   //view name
    }

    //    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/hi")
    public String hi(){
        return "home";
    }
}
