package day05;

import java.util.Scanner;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        System.out.println("1. 콜라");
        System.out.println("2. 사이다");
        System.out.println("3. 환타");
        System.out.println("0. 종료");

        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("메뉴를 입력하세요. ");
            menu = scanner.nextInt();

            if(menu == 0 )
                System.out.println("자판기 종료");

            if(menu < 1 || menu > 3){
                System.out.println("아직 준비되지 않은 메뉴입니다.  다시 선택해 주세요. ");
            }else{
                System.out.println(vendingMachine.pushProductButton(menu));
            }
        }while (menu != 0);

    }
}
