package com.example.iocexam.repository;

import com.example.iocexam.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    public User getUser(String email);
    public List<User> getUsers();
    public void addUser(User user);
    public Optional<User> getOptionalUser();
}
