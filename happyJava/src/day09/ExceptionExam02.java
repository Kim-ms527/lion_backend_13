package day09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//예외처리하는 두가지 방법
//1. try-catch-finally
//2. throws  ..Exception
public class ExceptionExam02 {
    public static void methodA(){
        try {
            FileInputStream fis = new FileInputStream("abc");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void methodB() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("abc");
    }

    public static void main(String[] args)  {

        methodA();

        try {
            methodB();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
