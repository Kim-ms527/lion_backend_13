package day08;

public class MyClass implements MyInterface{
    @Override
    public void doSomething() {

    }

//    @Override
//    public void doDefault() {
//        MyInterface.super.doDefault();
//    }


    public static void main(String[] args) {
        MyInterface.staticMethod();  //구현할 클래스와는 상관없이..
        System.out.println(MyInterface.CONSTANT);

        MyInterface myInterface = new MyClass();
        myInterface.doDefault();
        myInterface.doSomething();

    }
}
