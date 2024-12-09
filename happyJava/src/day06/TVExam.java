package day06;

import java.util.Scanner;

public class TVExam {
    public static void main(String[] args) {
        //객체를 생성하는 쪽에 초기값을 정할 수 있도록 해주는것!!
//        TV tv1 = new TV();
        TV tv2 = new TV(true);
//        TV tv3 = new TV(false,7,10);

        Scanner scanner = new Scanner(System.in);

        Boolean flag = true;


        TV tv5 = new TV(flag);

    }
}
