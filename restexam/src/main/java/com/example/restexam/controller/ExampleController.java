package com.example.restexam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExampleController {

    @GetMapping("/example")
    public ResponseEntity<String> getExample(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Custom-Header", "carami")
                .body("Hello!!");
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id")Long id){
        User user = /*new User(id,"carami","010-111-1111","강남구 역삼동")*/ null;

        if(user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }
}
