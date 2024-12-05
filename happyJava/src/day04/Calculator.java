package day04;

public class Calculator {
    int result;
    //메소드
    // 입력값도 없고, 리턴값도 없는 메소드
    //접근제한자 void 메서드명(){ 구현부 }

    //입력을 받아서 실행하는 메서드
    //접근제한자 void 메소드명 (매개변수..) { 구현부 }


    //실행해서 결과를 리턴하는  메소드
    //접근제한자 리턴타입 메소드명(){구현부}

    //입력을 받아서 실행하고 리턴해주는 메소드
    //접근제한자 리턴타입 메소드명 (매개변수들..) {구현부}


    public int add(int i, int j){
        return i + j;
    }

    public void plus(int x, int y){
        result = x+y;
    }


}
