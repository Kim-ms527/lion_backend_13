package com.example.springdatajpa2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
    @Bean
//    @Transactional
    public CommandLineRunner run(CustomerRepository repository,CustomerService service){
        return args -> {
//          repository.findAll().forEach(customer -> log.info(customer.getName()));

//            Customer customer = repository.findById(1L).get();  //이때 트랜잭션이 종료됨.
////            log.info(customer.getName());
////            customer.getOrders().forEach(order -> log.info(order.getProduct()));
//            List<Order> orders = customer.getOrders();  //레이지 로딩이 일어나는 시점.  // 트랜잭션안에 없는 상태.
//            orders.forEach(order -> log.info(order.getProduct()));


            service.getCustomer(1L);
        };
    }
}
