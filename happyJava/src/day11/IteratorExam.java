package day11;

import java.util.*;

public class IteratorExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");


        for(int i = 0; i < list.size(); i++){   //ArrayList는 순서가 있는 자료구조이므로 이방법이 가능.
            System.out.println(list.get(i));
        }

        System.out.println("=======================");

        Iterator<String> iter =  list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
//            iter.remove();
        }

        System.out.println("====================================");
        for(String item : list){
            System.out.println(item);
        }

        System.out.println("=========set=============");

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

//        for(int i = 0; i)   set은 순서가 없는 자료구조이므로 index가 존재하지 않는다.
        Iterator<String> setIter = set.iterator();
        while (setIter.hasNext()){
            System.out.println(setIter.next());
        }
        System.out.println("===============================");
        for(String item : set){      //java5에서 추가됨.
            System.out.println(item);
        }

    }
}
