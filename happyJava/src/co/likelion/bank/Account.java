package co.likelion.bank;

import co.likelion.bank.exception.InvalidTransactionException;

public class Account {
    private String accountNumber;
    private double balance;
    private String ownerId;

    public Account(String accountNumber, String ownerId) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.ownerId = ownerId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidTransactionException("입금 금액은 0보다 커야 합니다.");
        }
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance + "원");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new InvalidTransactionException("출금 금액은 0보다 커야 합니다.");
        }
        if (amount > balance) {
            throw new InvalidTransactionException("잔액이 부족합니다. 현재 잔액: " + balance + "원");
        }
        balance -= amount;
        System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance + "원");
    }
}

