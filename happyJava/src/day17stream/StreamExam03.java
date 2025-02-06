package day17stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam03 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Cherry", "Date");

        //각 요소를 소문자로 바꿔서 출력해주세요.
        words.stream()
                .map(word -> word.toLowerCase())
                .forEach(System.out::println);

        int[] intArr = {2,4,5,7,33,55,77};
        //각 요소에 3을 더해서 출력해주세요.
       int[] resultArr =  Arrays.stream(intArr)
                .map(n->n+3)
//                .forEach(System.out::println);
                .toArray();



        System.out.println(Arrays.toString(resultArr));

        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Apple", "Banana","zzz"),
                Arrays.asList("Cherry", "Date")
        );

        System.out.println(nestedList);
        List<String> flatList=         nestedList.stream()
                .flatMap(Collection::stream) //리스트 평탄화
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(flatList);

        int[] iarr = {3,7,2,78,24,9,77,23};

        //위 배열을 오름차순으로 정렬해서 출력하세요.
        Arrays.stream(iarr)
                .sorted() //IntStream에서 기본형 int 만 지원..
                .forEach(System.out::println);


        //위 배열을 내림차순으로 정렬해주세요.
        Arrays.stream(iarr)
                .boxed()
                .sorted(Comparator.reverseOrder())  //Integer
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// forEach 사용 예시
        numbers.stream()
                .forEach(n -> System.out.println("Number: " + n));

// peek 사용 예시
        List<Integer> doubledNumbers = numbers.stream()
                .peek(n -> System.out.println("Processing 1: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("Processing 2: " + n))
                .collect(Collectors.toList());
    }
}
