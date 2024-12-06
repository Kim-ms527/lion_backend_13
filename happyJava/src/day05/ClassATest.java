package day05;

public class ClassATest {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println(a.fieldB);
        System.out.println(a.fieldC);
//        System.out.println(a.fieldD); --private한 필드는 클래스내부에서만 가능
        System.out.println(a.fieldE);
    }
}
