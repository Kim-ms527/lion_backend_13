package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaExam5 {
    public static void main(String[] args) {
        //메소드 참조 ::
        //1. 정적메서드 참조
//        BiFunction<Integer, Integer, Integer> maxFunc = (a,b)->Math.max(a,b);
        BiFunction<Integer, Integer, Integer> maxFunc = Math::max;
        System.out.println(maxFunc.apply(4,7));

        //2. 인스턴스 메서드 참조
        String str = "hello world";
        Supplier<Integer> lengthFunc = str::length;
        System.out.println(lengthFunc.get());

        //3. 임의 객체의 인스턴스 메서드 참조
        List<String> words = Arrays.asList("hello","java","hi");
        List<Integer> lengths = new ArrayList<>();

        Function<String, Integer> lengthF = String::length;

        for(String word : words){
            lengths.add(lengthF.apply(word));
        }

        System.out.println(lengths);

        //4. 생성자 참조
        Supplier<List<String>> listSupplier = ArrayList::new;

        List<String> list = listSupplier.get();
        list.add("kang");
        list.add("kim");
        list.add("hong");

        System.out.println(list);

//        Book::new

    }
}
