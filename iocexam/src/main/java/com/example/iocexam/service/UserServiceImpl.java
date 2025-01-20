package com.example.iocexam.service;

import com.example.iocexam.domain.User;
import com.example.iocexam.repository.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void joinUser(User user) {
        userDao.addUser(user);
    }
}
