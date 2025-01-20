package com.example.iocexam.repository;

import com.example.iocexam.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//@Repository("carami")
public class UserCaramiDaoImpl implements UserDao{
    @Override
    public User getUser(String email) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return List.of();
    }

    @Override
    public void addUser(User user) {
        System.out.println(user+"의 정보를 caramiDao가 잘 저장하였습니다.");
    }

    @Override
    public Optional<User> getOptionalUser() {
        return Optional.empty();
    }
}
