package co.likelion.bank.exception;

// 계좌 관련 예외 처리
public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}