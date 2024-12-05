package day04;

//import java.util.Random;

public class Dice {
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
