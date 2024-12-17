package day10;

import java.util.ArrayList;

public class CollectionExam01 {
    public static void main(String[] args) {
        //가장 많이 사용되는 자료구조중 하나로..  약간 배열과 비슷하게 생각할 수 있다.
        ArrayList<String> strList = new ArrayList<>(5); //가변길이 자료구조!!
        System.out.println(strList.size());
//        System.out.println(strList.get);

        strList.add("abc");
        strList.add("bcd");
        strList.add("efd");

        System.out.println(strList.size());

        strList.add("abc");
        strList.add("bcd");
        strList.add("efd");

        System.out.println(strList.size());

        System.out.println(strList.get(3));

        //반복문
        for(int i = 0; i< strList.size() ; i++){
            System.out.println(strList.get(i));
        }
        System.out.println("=======================");

        for (String str:strList  ) {
            System.out.println(str);
        }

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);    // 1 객체인가요?  기본데이터타입일까요?  오토박싱 (java 5에서 추가)

        integerArrayList.add(Integer.valueOf(2));

        integerArrayList.add(3);

        System.out.println(integerArrayList);


        System.out.println(integerArrayList.remove(0));
        System.out.println(integerArrayList);

        System.out.println(integerArrayList.remove(Integer.valueOf(3)));

        System.out.println(integerArrayList);
        System.out.println(integerArrayList.contains(5));
        System.out.println(integerArrayList);
        integerArrayList.clear();
        System.out.println(integerArrayList);



        Integer i = 10; //에러..    //오토박싱
        int ivalue = i;  //오토언박싱



    }
}
