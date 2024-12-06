package day05;

public class ClassA {
    public static int fieldA; // 클래스 필드
    public int fieldB; // 인스턴스 필드

    int fieldC;  //default 접근제한자.

    private int fieldD;

    protected int fieldE;  //기본패키지까지 허용되고, 다른패키지라도 나의 자손은 접근가능

    public static void main(String[] args) {
        System.out.println(ClassA.fieldA);
//        System.out.println(ClassA.fieldB);  --인스턴스 필드는 인스턴스가 생성되야만 비로서 접근가능.
        ClassA a = new ClassA();
        System.out.println(a.fieldB);
        System.out.println(a.fieldD);
        System.out.println(a.fieldE);

    }
}
