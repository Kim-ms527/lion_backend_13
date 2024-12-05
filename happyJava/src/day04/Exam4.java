package day04;

class Pen{
    private String name;  //필드

    public void 쓰다(String msg){  //메소드
        System.out.println(msg);
    }
}
public class Exam4 {
    public static void main(String[] args) {
        //class Pen 은 단지 설계도, 틀
        //class를 이용해서 실체(진짜 펜) 을 만들어야 함.

        Pen p  =   new Pen();   //new 실체를 만든다.  만들어진 실체를 인스턴스라고 부른다.

        //p 레퍼런스 변수   int[] iarr   -  iarr 는 레퍼런스 변수.

        int i = 0;  //int를 담을수 있는 변수 i 를 선언했고,  int 값 0 을 넣어줌.
        //Pen p   -- Pen 을 가리킬 수 있는 변수 p 를 선언.

        p.쓰다("안녕!!");


    }
}
