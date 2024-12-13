package day10;

public class LocalOuterClass {
    private int outerField = 10;

    public void test(){
        //로컬 내부 클래스가 정의된 메서드 내에서만 사용이 가능!!
    }
    public void outerMethod(){
        //메소드 내에 클래스 정의 ( 로컬내부클래스)
        class InnerClass {
            public void innerMethod() {
                System.out.println("outerField : " + outerField);
            }
        }

            InnerClass inner = new InnerClass();
            inner.innerMethod();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();
    }
}
