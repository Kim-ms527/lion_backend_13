package day17stream;

import java.util.Arrays;
import java.util.List;

public class StreamExam04 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,-5);

        System.out.println(numbers.stream().allMatch(n->n>0)); //모든 숫자가 양수인지 체크
        boolean anyNegative = numbers.stream().anyMatch(n->n<0);//어떤숫자 하나라도 음수인가?
        System.out.println(anyNegative);

        int[] intArray = {2,4,6,8};
        boolean result = false;

        result = Arrays.stream(intArray).allMatch(n -> n % 3 != 0);
        System.out.println("모두 3의 배수입니까?"+ result);
        result = Arrays.stream(intArray).anyMatch(n -> n % 3 != 0);
        System.out.println("하나라도 3의 배수입니까? " + result);
        result = Arrays.stream(intArray).noneMatch(n -> n % 3 != 0);
        System.out.println("모두 3의 배수가 아닙니까?" + result);
    }
}
