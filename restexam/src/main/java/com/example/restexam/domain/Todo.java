package com.example.restexam.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "todos")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Todo {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String todo;  // 할 일 내용
    private boolean done; // 완료 여부

    public Todo(String todo) {
        this.todo = todo;
    }
}