package day03;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        //입력받아서

        Scanner keyboard = new Scanner(System.in);
        System.out.println("숫자를 입력하세요::");
        int num =  keyboard.nextInt();

        System.out.println(num);
        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }

        System.out.println("랜덤값");
        Random random = new Random();
        System.out.println(random.nextInt(100)+1);

//        Math.random()

    }
}
