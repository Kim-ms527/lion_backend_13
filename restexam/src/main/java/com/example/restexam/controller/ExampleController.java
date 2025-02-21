package com.example.restexam.controller;

import com.example.restexam.domain.User;
import com.example.restexam.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ExampleController {
    private final  UserService userService;

    @GetMapping("/example")
    public ResponseEntity<String> getExample(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Custom-Header", "carami")
                .body("Hello!!");
    }

    @GetMapping(value = "/user/{id}"/*, produces = "application/json"*/)
    public ResponseEntity<User> getUserById(@PathVariable("id")Long id){
        User user =  userService.findById(id);

        if(user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }
}
