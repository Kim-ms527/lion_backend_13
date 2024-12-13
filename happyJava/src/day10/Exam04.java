package day10;

import day06.Pen;

import java.util.ArrayList;

public class Exam04 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new String("abc"));
        list.add(new Book("java"));
        list.add(new Pen());


        Object obj = list.get(1);
        //형변환!!

        int[] iarr = new int[4];
        iarr[0] =0;

        Object[] objArr = new Object[5];
        objArr[0] = "abc";
        objArr[1] = new Pen();

        //object  타입으로 아무것이나 들어갔을때 단점은??

        ArrayList list2 = new ArrayList();
        list2.add("test");
        list2.add("abc");
        list2.add("book");

        ((String)list2.get(0)).toUpperCase();

        //컬렉션들에 아무거나 넣었지만.. 쓰다보니 이것저것 넣을을이 별로 없더라.
        //대체로 같은 타입의 데이터들을 넣더라!!
        //그럼에도 Object 타입으로 넣다 보니..  데이터를 사용할때 매번 형번환 해야하는 번거로움을 갖게 됐다.



        ArrayList<String> list3 = new ArrayList<>();  //<> 제네릭!!



    }
}
