package day06;

public class Exam02 {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println(child.i);

        //상속
        //1. 부모는(조상) 자식(자손)을 가리킬 수 있다.
        Parent p = null; //Parent를 담을(가리킬) 수 있는 타입
        Child c = null;

        p = new Parent();  //묵시적 형변환이 일어남.

//        c = new Parent();   //자식은 부모를 가리킬(담을) 수 없다.

        if(p instanceof Child) {
            c = (Child) p; // 실제로는 p가 가리키고있는 인스턴스가 Child 라는 사실을 알죠???  명시적 형변환 가능
            //명시적으로 형변환 할때는 주의!!
        }



        //



        //차 -  트럭

    }

}
