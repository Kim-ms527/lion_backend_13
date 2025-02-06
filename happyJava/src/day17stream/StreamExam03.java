package day17stream;

import java.util.Arrays;
import java.util.Collection;
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
                .sorted()
                .collect(Collectors.toList());
        System.out.println(flatList);
    }
}
