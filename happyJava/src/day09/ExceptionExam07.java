package day09;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionExam07 {
    public static void main(String[] args) {
        //연결하면, 반드시 닫아야하는 것이 중요하다!!!
        //반드시!! 이런것은 어디서 해야하나요?

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("abc");




        }catch (Exception e){
            System.out.println(e);
        }finally {
            try {
                fis.close();
            }catch (IOException e){
                System.out.println(e);
            }
        }


        //위와 같이 사용하던 것을..  try-with-resources  라는 구문이 추가됨으로서 좀 더 편하게 사용가능
        try( FileInputStream fis2 = new FileInputStream("abc")){

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
