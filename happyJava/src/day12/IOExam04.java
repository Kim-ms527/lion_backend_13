package day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOExam04 {
    public static void main(String[] args) {
        //파일로부터 입력 받아서, 파일에 출력하는 코드를 작성해 볼까요?
        //파일로 부터 입력 받는 클래스
        try(
            FileInputStream in = new FileInputStream("src/day12/IOExam01.java");
            FileOutputStream out = new FileOutputStream("copyFile.txt");
        ){
            int c ;
            int count = 0;
            while((c = in.read()) != -1){   //EOF  파일이 끝나면 -1값을 린턴해줘요.
//                System.out.print((char)c);
                out.write(c);
                count++;
            }

            System.out.println(count);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
