package com.example.securityexam3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/list")
    public String aaa(){
        return "list";
    }
    @GetMapping("/add")
    public String bbb(){
        return "add";
    }
    @GetMapping("/update")
    public String ccc(){
        return "update";
    }

    @GetMapping("/delete")
    public String delete(){
        return "delete";
    }
}
