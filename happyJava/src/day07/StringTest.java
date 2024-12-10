package day07;

public class StringTest {
    public static void main(String[] args) {


        MyClass myClass = new MyClass();
        myClass.i  = 10;


        String str1 = "hello";

        String str2 = new String("hello");

        String str3 = new String("hell0");

        String str4 = "hello";
        String str5 = "hello";


        System.out.println(str1 == str4);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2==str3);

        //String 은 조금 독특한 객체다.  (메모리상에서 문자열이 너무 많이 생성되므로 더
        //효율적으로 관리할 방법을 제공한다.
        //문자열을 관리하는 공간을 따로 가진다.






    }
}
