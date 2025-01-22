package com.example.aopexam.exam;

import org.springframework.stereotype.Component;

@Component
public class SimpleService {
    //핵심관심. - 우리가 구현할것!!

    public String doSomething(){
        //target
        System.out.println("SimpleService doSomething() run");
        return "Doing something.... ";
    }

    public void hello(){

        System.out.println("hello()  run... ");
//        if(1==1){
//            throw new RuntimeException();
//        }

    }

    public void setName(String name){

        System.out.println("setName() run");


    }

    public void getName(){
        System.out.println("getName() run..");
    }
}
