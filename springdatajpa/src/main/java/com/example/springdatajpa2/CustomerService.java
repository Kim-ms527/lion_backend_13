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

    // Customer와 그에 해당하는 모든 Order를 조회하는 메서드 예제
    @Transactional
    public void customersAndOrders() {
        List<Customer> customers = customerRepository.findAll(); // 모든 고객을 조회합니다.

        for (Customer customer : customers) {
            List<Order> orders = customer.getOrders(); // 각 고객이 가진 주문들을 조회합니다.
            System.out.println("Customer: " + customer.getName());
            for (Order order : orders) {
                System.out.println("Order: " + order.getProduct() + ", Date: " + order.getDate());
            }
        }
    }
    @Transactional
    public void fetchCustomersAndOrders() {
        List<Customer> customers = customerRepository.findAllCustomersWithOrders();

        for (Customer customer : customers) {
            List<Order> orders = customer.getOrders();
            System.out.println("Customer: " + customer.getName());
            for (Order order : orders) {
                System.out.println("Order: " + order.getProduct() + ", Date: " + order.getDate());
            }
        }
    }
}
