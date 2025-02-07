package day17stream.exam;

import java.util.Arrays;

public class Exam1 {
    public static void main(String[] args) {
        //1. 숫자배열 처리
        int[] numbers = {3, 10, 4, 17, 6};
        int sum = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println(sum);




    }
}
