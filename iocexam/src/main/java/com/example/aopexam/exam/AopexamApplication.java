package com.example.aopexam.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopexamApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(AopexamApplication.class);
    }

    @Autowired
    private SimpleService simpleService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("simpleService Test!!!! ");

        System.out.println(simpleService.doSomething());

        simpleService.hello();

        simpleService.getName();

        simpleService.setName("kang");
    }
}
