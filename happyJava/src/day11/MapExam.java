package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "kang");
        map.put(22, "kim");
        map.put(33,"hong");


        System.out.println(map);

        String value =  map.get(33);
        System.out.println(value);

        Set<Integer> keys =  map.keySet();

         Iterator<Integer> iter =  keys.iterator();

         while(iter.hasNext()){
             Integer key = iter.next();
             System.out.println(key);
             System.out.println(map.get(key));
         }

        System.out.println("++++++++++++++");
        System.out.println("++++++++++++++");

        Iterator<Integer> iter2 =  keys.iterator();
         while(iter2.hasNext()){
             Integer key = iter2.next();
             String item = map.get(key);
             System.out.println(key +"::"+item);
         }
        System.out.println("++++++++++++++");


         for(Integer k : keys){
             System.out.println(k +"::"+map.get(k));
         }


        System.out.println("====================");

         map.put(22, "lee");

        System.out.println(map);

        map.put(44,"lee");

        System.out.println(map);

        //Pen...  을 여러개 저장할때.. map을 이용한다면..

        //Peson.  --  주민번호, 이름, 주소, 전화번호  정보를 가지고 있다..
        //map에 저장한다면..  key 와 value를 어떻게 저장하면 좋을까요?




    }
}
