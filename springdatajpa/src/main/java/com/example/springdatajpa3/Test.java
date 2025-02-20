package com.example.springdatajpa3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("kang");
        names.add("kim");
        names.add("hong");

        String[] nameArray = names.toArray(new String[0]);//new String[0] 리스트 크가에 맞는 배열 생성해줌.

        for(String name : nameArray){
            System.out.println(name);
        }
    }
}
