package com.example.restexam.bexam;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza =new Pizza("Small",true,false,true);
        System.out.println(pizza);

        Pizza pizza2 = Pizza.builder()
                .size("Small")
                .cheese(true)
                .pepperoni(false)
                .build();   //메서드체이닝
        System.out.println(pizza2);

        Pizza pizza3 = Pizza.builder().size("Small").build();

        System.out.println(pizza3);
    }
}
