package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExam06 {
    //사용자 정의 예외!!

    public static void inputScore(int score) throws Exception{
        //사용자가 예외 상황을 직접정의하고,  예외을 발생시키고 있다.
        if(score <0 || score > 100){
//            System.out.println("점수는 0-100까지만 유요합니다.");
//            return;
            //이 상황이 예외라고 정의하고 예외를 발생 시킬 수 있다.
//            throw new Exception("점수는 0-100까지만 유요합니다.");
//            throw new MyException();
            throw new MyException("점수는 0-100까지만 유요합니다. 사용자는 "+score+" 를 입력했습니다.");
        }
        System.out.println("학생의 점수 :::  90"+score);
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);  //키보드로 부터 값을 입력받을수 있는 객체생성
        System.out.println("점수를 입력하세요.");


        try{
            inputScore(keyboard.nextInt());
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }


    }
}
