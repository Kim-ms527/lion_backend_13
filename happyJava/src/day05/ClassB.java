package day05;

public class ClassB {
    public static int sField;
    public int iField;

    public static void sMethod(){
        //사용할 수 있는 필드  (스태틱한 메소드는 스태틱한 필드만 접근 가능하다!!)
        System.out.println(sField);
//        System.out.println(iField);  인스턴스필드는 접근 불가.
    }
    public void iMethod(){
        //사용할 수 있는 필드   (둘 다 사용 가능)
        System.out.println(sField);
        System.out.println(iField);
    }

    public static void main(String[] args) {
        sMethod();
//        iMethod();  --


        ClassB b = new ClassB();
        b.iMethod();
    }

}
