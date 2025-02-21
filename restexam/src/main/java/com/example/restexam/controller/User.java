package com.example.restexam.controller;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class User {
    private Long id;
    private String name;
    private String phoneNumber;
    private String address;

    public User(Long id, String name, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public User(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
