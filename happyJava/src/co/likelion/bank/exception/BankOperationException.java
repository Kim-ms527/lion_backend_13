package co.likelion.bank.exception;

// 일반적인 은행 예외
public class BankOperationException extends RuntimeException {
    public BankOperationException(String message) {
        super(message);
    }
}