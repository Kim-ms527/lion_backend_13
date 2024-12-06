package com.carami.exam;

import day05.ClassA;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");

        ClassA a = new ClassA();
        System.out.println(a.fieldB);

//        System.out.println(a.fieldC);
//        -- 접근제한자.. fieldC는 default  영역이므로 패키지가 다른 곳에서는 사용불가

//        System.out.println(a.fieldD);

//        System.out.println(a.fieldE);
    }

}
