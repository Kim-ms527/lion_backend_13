package co.likelion.bank;

import co.likelion.bank.exception.AccountNotFoundException;
import co.likelion.bank.exception.BankOperationException;
import co.likelion.bank.exception.InvalidTransactionException;

import java.util.Scanner;

public class BankApplication{
    public static void main(String[] args) {
        Bank bank = new Bank("lion 은행");
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== lion 은행 시스템 ===");
        while (true) {
            System.out.println("\n1. 고객 등록");
            System.out.println("2. 계좌 생성");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("5. 잔액 조회");
            System.out.println("6. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1: // 고객 등록
                        System.out.print("고객 ID 입력: ");
                        String customerId = scanner.next();
                        System.out.print("고객 이름 입력: ");
                        String customerName = scanner.next();

                        bank.addCustomer(new Customer(customerId, customerName));
                        System.out.println("고객이 성공적으로 등록되었습니다!");
                        break;

                    case 2: // 계좌 생성
                        System.out.print("고객 ID 입력: ");
                        String existingCustomerId = scanner.next();
                        Customer customer = bank.getCustomer(existingCustomerId);

                        System.out.print("새 계좌 번호 입력: ");
                        String newAccountNumber = scanner.next();

                        customer.addAccount(new Account(newAccountNumber, existingCustomerId));
                        System.out.println("계좌가 성공적으로 생성되었습니다!");
                        break;

                    case 3: // 입금
                        System.out.print("고객 ID 입력: ");
                        String depositCustomerId = scanner.next();
                        Customer depositCustomer = bank.getCustomer(depositCustomerId);

                        System.out.print("계좌 번호 입력: ");
                        String depositAccountNumber = scanner.next();
                        System.out.print("입금 금액 입력: ");
                        double depositAmount = scanner.nextDouble();

                        Account depositAccount = depositCustomer.getAccount(depositAccountNumber);
                        depositAccount.deposit(depositAmount);
                        break;

                    case 4: // 출금
                        System.out.print("고객 ID 입력: ");
                        String withdrawCustomerId = scanner.next();
                        Customer withdrawCustomer = bank.getCustomer(withdrawCustomerId);

                        System.out.print("계좌 번호 입력: ");
                        String withdrawAccountNumber = scanner.next();
                        System.out.print("출금 금액 입력: ");
                        double withdrawAmount = scanner.nextDouble();

                        Account withdrawAccount = withdrawCustomer.getAccount(withdrawAccountNumber);
                        withdrawAccount.withdraw(withdrawAmount);
                        break;

                    case 5: // 잔액 조회
                        System.out.print("고객 ID 입력: ");
                        String balanceCustomerId = scanner.next();
                        Customer balanceCustomer = bank.getCustomer(balanceCustomerId);

                        System.out.print("계좌 번호 입력: ");
                        String balanceAccountNumber = scanner.next();

                        Account balanceAccount = balanceCustomer.getAccount(balanceAccountNumber);
                        System.out.println("현재 잔액: " + balanceAccount.getBalance() + "원");
                        break;

                    case 6: // 종료
                        System.out.println("프로그램을 종료합니다.");
                        return;

                    default:
                        System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                }
            } catch (InvalidTransactionException | AccountNotFoundException | BankOperationException e) {
                System.out.println("오류: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("알 수 없는 오류가 발생했습니다.");
            }
        }
    }
}