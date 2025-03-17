package com.example.swaggerexam.tdd;

import static  com.example.swaggerexam.tdd.Calculator.*;
public class CalMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(3,4);
        System.out.println(result);
//        if (result == 7){
//            System.out.println("성공");
//        }else {
//            System.out.println("실패");
//        }

//        Calculator.test();
        test();
    }
}
