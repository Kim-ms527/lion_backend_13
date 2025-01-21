package com.example.aopexam.test;

public class ExamDao {
    public void addExam(){

        //이 메서드가 할일
        System.out.println("이 메서드가 할일을 위한 코드실행1 ");
        System.out.println("이 메서드가 할일을 위한 코드실행2");
        System.out.println("이 메서드가 할일을 위한 코드실행3 ");
        System.out.println("이 메서드가 할일을 위한 코드실행4 ");

    }

    public void updateExam(){
        //DB접속
        DButil.getConn();

        //트랜잭션관련
        TransactionExam transactionExam = new TransactionExam();
        transactionExam.process();

        //이 메서드가 할일
        System.out.println("이 메서드가 할일을 위한 코드실행1 ");
        System.out.println("이 메서드가 할일을 위한 코드실행2");
                System.out.println("이 메서드가 할일을 위한 코드실행3 ");
        System.out.println("이 메서드가 할일을 위한 코드실행4 ");

        //트랜잭션 관련코드

        transactionExam.process();



        //로깅을 위한 코드
        LogExam logExam = new LogExam();
        logExam.logging();

        //DB접속을 끊는다.
        DButil.close();
    }
}
