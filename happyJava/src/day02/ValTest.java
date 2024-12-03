package day02;

public class ValTest {
    public static void main(String[] args) {
        int a = 10;

        //자바는 객체지향 언어.
        //기본형 (숫자, 문자, 불린)   -- 자바세상에 존재하는 소수민족!!
        //레퍼런스타입

        byte b = 123;
        short sh = 10;
        int i = 10;
        long l = 10;

        float f = 1.0f;
        double d = 1.0;

        char c = 'a';

        boolean boo=false;

        String str = "a";

        boo = i > 100;

        System.out.println(boo);

        boo = b > 200 || i++ > 5 ;

        System.out.println(boo);
        System.out.println(!boo);

        System.out.println(i);


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);


        System.out.println(5/2);

    }
}
