package com.example.restexam.service;

import com.example.restexam.domain.Todo;
import com.example.restexam.repository.TodoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    @Transactional(readOnly = true)
    public List<Todo> getTodos(){
        return todoRepository.findAll(Sort.by("id").descending());
    }

    @Transactional
    public Todo addTodo(String todo){
        return todoRepository.save(new Todo(todo));
    }

    @Transactional
    public Todo updateTodo(Long id){
        boolean exists = todoRepository.existsById(id);
        if(!exists){
            throw new EntityNotFoundException("이미 삭제된 Todo 입니다." + id);
        }
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("id에 해당되는  todo를 찾을 수 없어요." + id));

        todo.setDone(!todo.isDone());
        return todo;
    }

    @Transactional
    public void deleteTodo(Long id){
        if(!todoRepository.existsById(id)){
            throw new RuntimeException("id에 해당하는 todo가 없어요."+id);
        }
        todoRepository.deleteById(id);
    }

}
