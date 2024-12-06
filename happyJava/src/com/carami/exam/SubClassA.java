package com.carami.exam;

import day05.ClassA;

public class SubClassA extends ClassA {
    public void test(){
        System.out.println(fieldE);
//        System.out.println(fieldD); private 한 부분은 자손이라고 할지라도 접근 불가!!
    }
}
