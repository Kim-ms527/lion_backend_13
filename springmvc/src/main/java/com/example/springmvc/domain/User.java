package com.example.springmvc.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class User {
    public User(String name, boolean admin){
        this.name = name;
        this.admin = admin;
    }
    private String name;
    private boolean admin;
    @NotEmpty(message = "이름을 입력하세요.")
    private String username; //  ""    != null  - 달라요.
    @NotEmpty(message = "이메일을 입력하세요.")
    @Email(message = "이메일 형식에 맞게 입력하세요.")
    private String email;
}
