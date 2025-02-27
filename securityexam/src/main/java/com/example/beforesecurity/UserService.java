package com.example.beforesecurity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    public void test(){
      log.info(Thread.currentThread().getName()+"::"+UserContext.getUser().getName());
    }
}
