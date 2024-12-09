package day06;

public class Exam04 {
    public static void main(String[] args) {
        Parent p = new Child();

        System.out.println(p.i);
        System.out.println(p.getI());

        //2. 필드는 오버라이딩 되었을 때 타입을 따른다.

        //3. 메소드는 오버라이딩되면 무조건(타입에 상관없이) 자식것을 쓴다. (**** 핵심)



    }
}
