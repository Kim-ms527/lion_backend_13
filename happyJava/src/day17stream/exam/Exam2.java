package day17stream.exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam2 {
    public static void main(String[] args) {
        //2. 문자열 리스트 필터링
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() >= 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredWords);
    }
}
