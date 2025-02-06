package day17stream;

import java.util.Arrays;
import java.util.List;

public class StreamExam05 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11,22,33,55,77,99);

        long count = numbers.stream().count();
        System.out.println(count);
        int max = numbers.stream().max(Integer::compareTo).orElse(0);
        System.out.println();
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(average);
        int sum =  numbers.stream().mapToInt(Integer::intValue).sum();


//        Integer ii = Integer.valueOf(5);
//        int i = ii.intValue();

//        Integer ii = 10;
//        int i = ii.intValue();

    }


}
