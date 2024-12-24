package day12;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOExam03 {
    public static void main(String[] args) {
        //키보드로부터 5줄 입력 받아서 콘솔에 출력하고 싶어요.
        //파일에 출력하고 싶다면??
        try(
//        FileWriter fw = new FileWriter("test.txt");
        PrintWriter pw = new PrintWriter("test.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ){
            for (int i = 0; i < 5; i++) {
                String msg = br.readLine();
                System.out.println(msg);
                pw.println(msg);   // test.txt 파일에 msg를 써주세요.   (이파일에 실제 쓰여지는 시점?)
                //이 파일에 쓰는 일은 누가할까요?


            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
