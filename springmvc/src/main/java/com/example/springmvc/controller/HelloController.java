package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HelloController {
    @GetMapping("/home2")
    public String home() {
        return "home";   //view name
    }

    //    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/test2")
    public String test22() {
        return "test";
    }

    @GetMapping("/hi")
    public String hi(){
        return "home";
    }
}
