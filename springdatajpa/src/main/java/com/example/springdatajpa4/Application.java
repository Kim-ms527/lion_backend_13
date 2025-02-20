package com.example.springdatajpa4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository employeeRepository){
        return args -> {
//            Employee employee = employeeRepository.findById(101L).get();
//            log.info(employee.getEmail());

            log.info("Employees with last name 'King':");
            employeeRepository.findByLastName("King").forEach(employee -> log.info(employee.toString()));

        };
    }
}
