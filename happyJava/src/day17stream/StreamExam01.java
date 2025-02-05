package day17stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExam01 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("kang","kim","hong","lee");

       List<String> filterWord =  myList.stream()
               .filter(s -> s.startsWith("k"))
               .collect(Collectors.toList());

        System.out.println(filterWord);

        //스트림을 쓰지 않는다면???
        List<String> resultList = new ArrayList<>();
        for(String str : myList){
            if(str.startsWith("k")){
                resultList.add(str);
            }
        }

        System.out.println(resultList);

        //myList를 하나씩 출력하고 싶다면?
        for(String str : myList){
            System.out.println(str);
        }
        System.out.println("stream이용");
        //Stream을 이용하는 코드로 바꿔본다면?
        Stream<String> myListStream = myList.stream();
        myListStream.forEach(System.out::println);

        System.out.println("stream 재활용!!");
        //이미 사용한 스트림을 다시 사용할 때..  어떻게 될까요??
        //왜??  사용이 안되는지 이해될까요?

//        myListStream.forEach(System.out::println);  사용이 이미 끝난 스트림.   물이 흘러가듯 데이터가 이미 흘러갔다.


        String[] names = {"kang","hong","kim","lee","park"};

        Arrays.stream(names).forEach(name -> System.out.println(name));
        Arrays.stream(names).forEach(System.out::println);
        Arrays.stream(names).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        int[] iarr = {1,3,4,5,6,7,87,9,0};

        //짝수만 출력  (스트림 없이.)
        for(int i : iarr){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //짝수만 출력 (스트림 사용해서)
        Arrays.stream(iarr).filter(i ->i%2==0 ).forEach(System.out::println);
    }
}
