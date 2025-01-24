package com.example.springmvc.controller;

import com.example.springmvc.domain.User;
import jakarta.validation.Valid;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("register")
    public String registerForm(Model model){
        model.addAttribute("user", new User());

        return "registerForm";
    }

    @PostMapping("register")
    public String register(@Valid @ModelAttribute("user") User user, BindingResult result){
        if(result.hasErrors())
            return "registerForm";

        return "result";
    }

}
