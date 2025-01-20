package com.example.iocexam.config;

import com.example.iocexam.controller.UserController;
import com.example.iocexam.repository.UserCaramiDaoImpl;
import com.example.iocexam.repository.UserDao;
import com.example.iocexam.repository.UserDaoImpl;
import com.example.iocexam.service.UserService;
import com.example.iocexam.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = "com.example.iocexam")
@Configuration
@ComponentScan(basePackages = {"sample.bean","com.example.iocexam"})
public class UserConfig {

    @Bean
    public UserDao userDao(){
        return new UserDaoImpl();
    }

    @Bean
    public UserDao userDao2(){
        return new UserCaramiDaoImpl();
    }

    @Bean
    public UserService userService(){
//        return new UserServiceImpl(userDao); //생성자를 통한 주입
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao2());
        return userService;
    }

    @Bean
    public UserController userController(UserService userService){
//        return new UserController(userService);
        UserController userController = new UserController();
        userController.setUserService(userService);
        return userController;
    }
}
