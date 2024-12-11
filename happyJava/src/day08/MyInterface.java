package day08;

public interface MyInterface {
//    public static final int CONSTANT = 10;  //상수는 대문자로 쓰는것이 관례다.  OIL_PRICE
    public int CONSTANT = 10;  //명시적으로 입력하지 않아도 인터페이스에서는 static final 포함된다.

    void doSomething();

    public default void doDefault(){ //오버라이드 해서 사용하게 할 목적으로 정의한 메서드.
        // (반드시 오버라이드 하지 않아도 되게하려고)
        System.out.println("구현이 가능하다. ");
    }

    public static void staticMethod(){
        System.out.println("인터페이스의 static 메소드");


    }
}
