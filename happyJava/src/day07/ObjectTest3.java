package day07;

import java.sql.SQLOutput;

public class ObjectTest3 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.i = 10;

        MyClass myClass2 = new MyClass();
        myClass2.i = 5;

        System.out.println(myClass == myClass2);

        System.out.println(myClass.equals(myClass2));


//        System.out.println(myClass.equals(myClass));
//
//        System.out.println(myClass.equals("str"));


//        int i = 10;
//
//        int j = 10;
//
//        System.out.println(i == j );
//


        System.out.println("==============person==============");
        Person kang = new Person("kang",20,"강남구 역삼동");
        Person kang2 = new Person("kim", 30,"강서구 염창동");


        System.out.println(kang.equals(kang2));

        System.out.println(kang.hashCode());
        System.out.println(kang2.hashCode());


        String str1 = new String("hello");
        String str2 = new String("" +
                "" +
                "" +
                "");

        System.out.println("==========================String=========");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));




    }
}
