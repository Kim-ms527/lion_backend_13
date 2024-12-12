package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//예외종류가 2가지.
//실행시 발생하는 예외(Runtime Exception)
//컴파일시 체크하는 예외 (checked Exception)
public class ExceptionExam01 {
    public static void main(String[] args) {
        int[] iarr = {1,2,3,4};

        try {
            iarr[5] = 10;   //컴파일시에 체크하지 않는다.
        }catch (Exception e){
            System.out.println(e);
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("abc.txt");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }




    }

}
