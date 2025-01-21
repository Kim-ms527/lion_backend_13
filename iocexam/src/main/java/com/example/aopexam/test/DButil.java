package com.example.aopexam.test;

public class DButil {
    public static void getConn(){
        System.out.println("디비접속을 위한 코드실행1 ");
        System.out.println("디비접속을 위한 코드실행2");
        System.out.println("디비접속을 위한 코드실행3 ");
        System.out.println("디비접속을 위한 코드실행4 ");
        System.out.println("디비접속을 위한 코드실행5 ");
    }

    public static void close(){
        System.out.println("DB접속을 끊기 위한 코드실행1 ");
       System.out.println("DB접속을 끊기 위한 코드실행3 ");
        System.out.println("DB접속을 끊기 위한 코드실행4 ");
    }
}
