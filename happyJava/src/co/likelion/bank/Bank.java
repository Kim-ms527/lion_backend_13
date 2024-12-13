package co.likelion.bank;

import co.likelion.bank.exception.BankOperationException;

public class Bank {
    private String name;
    private Customer[] customers;
    private int customerCount;

    public Bank(String name) {
        this.name = name;
        this.customers = new Customer[10]; // 최대 10명의 고객
        this.customerCount = 0;
    }

    public void addCustomer(Customer customer) {
        if (customerCount >= 10) {
            throw new BankOperationException("고객 수를 초과했습니다.");
        }
        customers[customerCount++] = customer;
    }

    public Customer getCustomer(String customerId) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getId().equals(customerId)) {
                return customers[i];
            }
        }
        throw new BankOperationException("고객을 찾을 수 없습니다: " + customerId);
    }
}
