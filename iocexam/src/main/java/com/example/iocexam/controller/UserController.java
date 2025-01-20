package com.example.iocexam.controller;

import com.example.iocexam.domain.User;
import com.example.iocexam.service.UserService;



public class UserController {
    private UserService userService;

    public UserController(){

    }


//    public UserController(UserService userService) {
//        this.userService = userService;
//    }


    public void setUserService(UserService userService) {
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
}
