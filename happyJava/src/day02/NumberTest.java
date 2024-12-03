package day02;

public class NumberTest {
    public static void main(String[] args) {
        int a = 10;
//
//        a++;  //증가연산자  a = a + 1;
//        ++a;   //문장 하나로 끝날때는 ++ 앞에 나오나 뒤에 나오나 차이가 없다.


//        System.out.println(++a);   11

        System.out.println(a++);  //10


        System.out.println(a);

        while(++a>20){

        }

        int b = 10;

        System.out.println(b=b+20);

        System.out.println(b);

        a = 5;

        a = a + 5;  // a+= 5;

        System.out.println(a * (b + 5));

    }
}
