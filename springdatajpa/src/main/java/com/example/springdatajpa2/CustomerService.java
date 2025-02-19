package com.example.springdatajpa2;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Transactional
    public Customer getCustomer(Long id){
        Customer customer =customerRepository.findById(id).get();
        log.info("getCustomer  getOrders() 호출하는 시점!! ");
        List<Order> orders = customer.getOrders();
        orders.forEach(order -> log.info(order.getProduct()));
        return customer;
    }
}
