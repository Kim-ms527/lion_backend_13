package day17;

import day15.c.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExam2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("carami","kim","hong","kang");

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        names.forEach(consumer);

        names.forEach( new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        names.forEach(name-> System.out.println(name));

        names.forEach(System.out::println);   //메소드레퍼런스
    }
}
