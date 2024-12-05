package day04;

//import java.util.Random;
//모든 클래스는 생성자를 갖는다. 
//컴파일러는 정의된 클래스에 생성자가 없다면 기본 생성자를 자동으로 만든다. 
public class Dice {
    public Dice(){
        System.out.println("Dice의 기본 생성자 실행!!!");
    }    //내가 생략하면 컴파일러는 디폴트 생성자를 자동으로 만든다. 
    //속성 - 면 , 눈
    int face;
    int eye;

    //행위 - 주사위를 굴리다.
    public void roll(){
        //주사위를 굴렸을때...   면 중 하나가 랜덤하게 나온다.
//
//        Random random = new Random();
//        random.nextInt();

        eye = (int)(Math.random()*face)+1;
    }
}
