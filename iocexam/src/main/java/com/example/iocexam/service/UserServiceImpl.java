package com.example.iocexam.service;

import com.example.iocexam.domain.User;
import com.example.iocexam.repository.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service("userService")
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public UserServiceImpl(){}

//    @Autowired
    public UserServiceImpl(@Qualifier("carami") UserDao userDao) {
        this.userDao = userDao;
    }
//    @Autowired
    @Resource
    public void setUserDao( @Qualifier("carami")UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void joinUser(User user) {
        userDao.addUser(user);
    }

    public void getUser(String id){
       User user =  userDao.getOptionalUser().orElse(new User());
       user.getName();
    }
}
