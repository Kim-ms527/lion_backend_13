package day05;

public class Student {
    String name;
   static String 소속;   //-- 인스턴스화될때 생성되는게 아니라 미리 한 번 만 생성된다.  값이 공유된다.

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="강경미";
        s1.소속="멋쟁이사자처럼";

        Student s2 = new Student();
        s2.name="강경미";
        s2.소속="멋쟁이사처럼";


        String str  = Student.소속;

    }

}
