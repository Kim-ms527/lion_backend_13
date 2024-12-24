package day12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOExam02 {
    public static void main(String[] args) throws Exception {
        //키보드로 부터 한줄씩 입력 받아서 콘솔에 출력하고 싶다.
        //키보드 - System.in   --- InputStream
//        InputStream is = System.in;
        //키보드 대신에 파일에서 받고싶다..
        FileInputStream fis = new FileInputStream("src/day12/IOExam01.java");
        //한줄씩 입력 받기위해서...  BufferedReader  -- 생성자에 Reader 를 받게..
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

//        System.out.println("입력하세요::");
        String str = br.readLine();

        System.out.println(str);


    }
}
