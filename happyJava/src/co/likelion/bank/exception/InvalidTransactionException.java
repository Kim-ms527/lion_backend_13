package co.likelion.bank.exception;

// 입출금 관련 예외 처리
public class InvalidTransactionException extends RuntimeException {
    public InvalidTransactionException(String message) {
        super(message);
    }
}
