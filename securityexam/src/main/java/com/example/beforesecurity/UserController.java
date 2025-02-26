package com.example.beforesecurity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class UserController {
    @GetMapping("/hello")
    public String hello(){
        log.info("UserController  hello() 실행");
        return "hello";
    }

    @GetMapping("/test/hi")
    public String hi(){
        log.info("UserController  hi() 실행");
        return "hi";
    }
}
