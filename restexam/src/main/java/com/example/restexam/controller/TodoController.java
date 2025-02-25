package com.example.restexam.controller;

import com.example.restexam.domain.Todo;
import com.example.restexam.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping
    public ResponseEntity<List<Todo>> getTodos(){
        return ResponseEntity.ok(todoService.getTodos());
    }

    //todo 추가
    @PostMapping
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo){
        Todo createTodo = todoService.addTodo(todo.getTodo());
        return ResponseEntity.status(HttpStatus.CREATED).body(createTodo);
    }

    //todo의 done 수정
    @PatchMapping("/{id}")
    public ResponseEntity<Todo> updateTodd(@PathVariable("id")Long id){
        Todo updateTodo = todoService.updateTodo(id);
        return ResponseEntity.ok(updateTodo);
    }
//
//    @DeleteMapping
//    public ResponseEntity<Void> deleteTodo(@RequestBody Todo todo){
//        todoService.deleteTodo(todo.getId());
//        return ResponseEntity.noContent().build();
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable("id")Long id){
        todoService.deleteTodo(id);
        return ResponseEntity.noContent().build();
    }
}
