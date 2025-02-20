package com.example.springdatajpa3;

import java.util.List;

public interface UserRepositoryCustom {
    List<User> findUsersByName(String name);
    List<User> findusersDynamically(String name, String email);
}
