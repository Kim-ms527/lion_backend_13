package day12;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputExam {
    public static void main(String[] args) {
        try(
                DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
                ){
            if(dis.readBoolean()){
                System.out.println("true인가요?");
            }
            byte b = dis.readByte();
            System.out.println(b);
            char c = dis.readChar();
            System.out.println(c);
            System.out.println(dis.readDouble());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
