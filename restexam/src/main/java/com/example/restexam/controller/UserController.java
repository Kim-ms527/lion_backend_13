package com.example.restexam.controller;

import com.example.restexam.domain.User;
import com.example.restexam.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final  UserService userService;

    //http://localhost:8080/api/users       -- GET
    //curl -X GET http://localhost:8080/api/users
    @GetMapping
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok(userService.getUsers());
    }
    //http://localhost:8080/api/users       -- POST
    //curl -X POST -H "Content-Type: application/json" -d "{\"name\":\"kang\",\"email\":\"kang@exam.com\"}"
    // http://localhost:8080/api/users
    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user){
        User createUser = userService.addUser(user);
        return ResponseEntity.ok(createUser);
    }

    //http://localhost:8080/api/users/{id}       -- GET
    //curl -i -X GET http://localhost:8080/api/users/1
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id){
        return ResponseEntity.ok(userService.getUser(id));
    }
    //http://localhost:8080/api/users/{id}       -- PUT
    //curl -X PUT -H "Content-Type: application/json"
    // -d "{\"name\":\"kang_update\",\"email\":\"kang_update@exam.com\"}" http://localhost:8080/api/users/1
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user){
        user.setId(id);
        User updateUser = userService.updateUser(user);
        return ResponseEntity.ok(updateUser);
    }

    //http://localhost:8080/api/users/{id}       -- DELETE
    //curl -X DELETE http://localhost:8080/api/users/1
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id")Long id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


    //위에 제시한 것들이 실행되도록  UserController 를 완성해보세요.
}
