package day12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class IOExam01 {
    public static void main(String[] args) throws Exception {
        //키보드로 부터 한줄씩 입력 받아서 콘솔에 출력하고 싶다.
        //키보드 - System.in   --- InputStream
        //한줄씩 입력 받기위해서...  BufferedReader  -- 생성자에 Reader 를 받게..
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("입력하세요::");
        String str = br.readLine();

        System.out.println(str);



//        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("")))

        //파일로부터 읽고싶다.
        FileInputStream fis = new FileInputStream("hello.txt");
        //BufferedReader는 Reader만 받아들일 수 있으므로,  FileInputStream 이 직접 못들어간다.
        //InputStream을 Reader로 바꿔주는 커넥트 필요!!
        InputStreamReader isr = new InputStreamReader(fis);
        //한줄씩 읽고싶다.
        BufferedReader br2 = new BufferedReader(isr);

        System.out.println("br2로부터 읽어옴:: "+br2.readLine());

        BufferedReader br3 = new BufferedReader(new InputStreamReader(new FileInputStream("hello.txt")));
        System.out.println("br3로부터 읽어옴:: "+br3.readLine());





    }
}
