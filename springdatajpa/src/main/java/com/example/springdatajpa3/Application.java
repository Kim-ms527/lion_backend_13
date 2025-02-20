package com.example.springdatajpa3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }


    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
//        userRepository.findAll().forEach(user -> log.info("user :: "+user.getName()));

//        userRepository.findUsersByName("k")
//                .forEach(user -> log.info("user :: "+user.getName()));

        userRepository.findusersDynamically("carami","carami@exam.com")
                .forEach(user -> log.info("user :: {} {} ",user.getName(),user.getEmail()));

    }

    //조건배열
    // u.name = name
    // u.email = email

    //where  u.name = name and u.email = email

}
