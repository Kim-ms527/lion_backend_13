package com.example.springmvc.controller;

import com.example.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/users")
    public String users(Model model) {
        List<User> users = Arrays.asList(
                new User("kang", true),
                new User("kim", false),
                new User("hong", false)
        );

        model.addAttribute("users", users);

        return "users";
    }
}
