package day06;

//상속에서 생각해볼 부분!!
//부모가 가진것을 자식이 똑같이 다시 정의 할 수 있어요!!  오버라이딩 이라고 한다.
class Parent{
    int i = 5;

    public int getI(){
        return i;
    }
}

class Child extends Parent{
    int i = 10;   //i가 오버라이딩 된 상태.
}
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
