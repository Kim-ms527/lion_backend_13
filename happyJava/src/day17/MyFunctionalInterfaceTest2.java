package day17;


public class MyFunctionalInterfaceTest2 {

    public static void main(String[] args) {
        MyFunctionalInterface2 f2;

        f2 = (a,b) -> a+b;

        System.out.println(f2.method(32,3));

    }
}
