package day06;

class 도형{
    int 가로;
    int 세로;

    도형(){}
    도형(int 가로, int 세로){
        this.가로 = 가로;
        this.세로 = 세로;
    }

    // 도형에 생성자가 추가되자 이 도형을 상속받은 클래스가 오류가 나고 있어요.
    //이유가 무엇일까요?
    //this()  -- 자신의 생성자를 의미.
    //super  -- 부모를 가리키는 키워드  super.필드,  super.메소드  super() - 부모의 생성자의미

}

class 원 extends 도형{
    원(){
        super(0,0);
    } //우리가 직접 추가하지 않으면 이런 코드가 자동으로 추가됨..
}
class 사각형 extends 도형{

    사각형(){
        super(0,0);
    }
    사각형(int 가로, int 세로){
        super(가로,세로);
    }
}

public class Exam08 {
    public static void main(String[] args) {

    }
}
