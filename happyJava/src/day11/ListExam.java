package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        System.out.println(fruits);
        String firstFruit  = fruits.get(0);  //get(index)
        System.out.println(firstFruit);

        System.out.println(fruits);
        fruits.set(1,"persimmon");   //해당 인덱스의 데이터 교체

        System.out.println(fruits);
        fruits.add(1,"banana");  // 데이터 추가

        System.out.println("정렬전");
        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println("정렬후");
        System.out.println(fruits);

        System.out.println(fruits);
        fruits.remove("apple");
        boolean delFlag = fruits.remove("apple");
        System.out.println(fruits);
        String delItem = fruits.remove(1);
        System.out.println(fruits);

//       fruits.removeFirst();
//        fruits.removeLast();

        System.out.println(fruits);

        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(2);
        integerList.add(3);

        System.out.println(integerList);
        Collections.shuffle(integerList);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);

    }
}
