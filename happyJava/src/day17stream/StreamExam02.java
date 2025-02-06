package day17stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam02 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Cherry", "Date");

        //글자수가 5개 이상인 것만 필터링 하고 중복은 제거하고 새로운 리스트를 얻고 싶어요.
        //스트림 사용하지 않고,  위에 제시된 문제를 풀어보세요.
        List<String> resultWord = new ArrayList<>();
        for(String word : words){
            if(word.length() >= 5){
                if(resultWord.contains(word)) continue;
                else resultWord.add(word);
            }
        }

        System.out.println(resultWord);

        //Stream 이용.
        List<String> resultWords2 =   words.stream()
                .filter(w -> w.length() >=5) //필터링
                .distinct() //중복처리
                .collect(Collectors.toList());   //새로운 리스트 반환  (가변)
        System.out.println(resultWords2);
        resultWords2.add("kang");
        System.out.println(resultWords2);

        List<String> resultWords3 =   words.stream()
                .filter(w -> w.length() >=5) //필터링
                .distinct() //중복처리
                .toList(); // 불편리스트 리턴

//        resultWords3.add("test");   오류 발생.

        System.out.println(resultWords3);
    }
}
