package day13;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        System.out.println("안녕!!");
        Scanner keboard = new Scanner(System.in);
        String msg = keboard.next();
//수행흐름--  하나  (단일 쓰레드)
        System.out.println("입력한 메시지는 "+msg);
    }
}
