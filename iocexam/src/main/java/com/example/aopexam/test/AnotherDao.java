package com.example.aopexam.test;

public class AnotherDao {
    public void addAnother(){
        //DB접속
        DButil.getConn();

        //이 메서드가 할일
        System.out.println("이 메서드가 할일을 위한 코드실행1 ");
        System.out.println("이 메서드가 할일을 위한 코드실행2");
        System.out.println("이 메서드가 할일을 위한 코드실행3 ");
        System.out.println("이 메서드가 할일을 위한 코드실행4 ");


        //DB접속을 끊는다.
       DButil.close();
    }

    public void getAnother(){
        //DB접속
        DButil.getConn();

        //이 메서드가 할일
        System.out.println("이 메서드가 할일을 위한 코드실행1 ");
        System.out.println("이 메서드가 할일을 위한 코드실행2");
        System.out.println("이 메서드가 할일을 위한 코드실행3 ");
        System.out.println("이 메서드가 할일을 위한 코드실행4 ");


        //DB접속을 끊는다.
        DButil.close();
    }
}
