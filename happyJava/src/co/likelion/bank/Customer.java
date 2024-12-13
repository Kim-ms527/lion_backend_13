package co.likelion.bank;

import co.likelion.bank.exception.AccountNotFoundException;
import co.likelion.bank.exception.BankOperationException;
import co.likelion.bank.exception.InvalidTransactionException;
public class Customer {
    private String id;
    private String name;
    private Account[] accounts;
    private int accountCount;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
        this.accounts = new Account[5]; // 고객당 최대 5개 계좌
        this.accountCount = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        if (accountCount >= 5) {
            throw new BankOperationException("최대 계좌 개수를 초과했습니다.");
        }
        accounts[accountCount++] = account;
    }

    public Account getAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        throw new AccountNotFoundException("계좌 번호를 찾을 수 없습니다: " + accountNumber);
    }
}