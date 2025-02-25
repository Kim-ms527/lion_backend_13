package com.example.restexam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class ErrorTestController {
    @GetMapping("/api/e")
    public String test(){
        throw new RuntimeException("API 에서 에러가 발생!!");
//        return "hello";
    }

    @GetMapping("/api/n")
    public String test2(@RequestParam(name = "id", required = false)Long id){
        if(id == null){
            throw new RuntimeException("ID가 없습니다.");
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "user를 찾지 못했습니다.");
    }
}
