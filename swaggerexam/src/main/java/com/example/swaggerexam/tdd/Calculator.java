package com.example.swaggerexam.tdd;

public class Calculator {
    public int add(int i, int j) {
        return i + j;
    }

    public double divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return (double) a/b;
    }

    public static void test(){}
}
