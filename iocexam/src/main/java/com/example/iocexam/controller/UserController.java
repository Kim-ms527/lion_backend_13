package com.example.iocexam.controller;

import com.example.iocexam.domain.User;
import com.example.iocexam.service.UserService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


//@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(){
        System.out.println("UserController() 실행");
    }



    public UserController(UserService userService) {
        System.out.println("UserController(UserService userService) 실행");
        this.userService = userService;
    }

@Autowired
    public void setUserService(UserService userService) {
        System.out.println("setUserService(UserService userService) 실행");
        this.userService = userService;
    }

    public void joinUser(){
        //실제로 동작할때는 user정보를 사용자로부터 정보를 받겠죠???
        User user = new User();
        user.setName("kang");
        user.setEmail("carami@gmail.com");
        user.setPassword("1111");



        userService.joinUser(user);
    }

    @PostConstruct
    public void init(){
        //해당빈이 생성된 직 후에 이 메서드를 호출해줌.
        System.out.println("PostConstruct 실행!!!");
    }
    @PreDestroy
    public void destory(){
        System.out.println("빈이 소멸되기전에 호출됨.. PreDestroy 실행");
    }
}
