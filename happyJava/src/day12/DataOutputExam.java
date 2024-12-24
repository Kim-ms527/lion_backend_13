package day12;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputExam {
    public static void main(String[] args) {
        //기본데이터타입으로 파일에 쓰고 싶다.
        // (파일에 저장하긴 하지만, 사람이 읽을 수 있는 것이 아니라.. 시스템이 바로 읽을 목적으로 사용)

        //파일에 쓰기위해서 FileOutputStream.
        //DataOutputStream
        try(
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
        ){

            dos.writeBoolean(true);
            dos.writeByte(Byte.MAX_VALUE);
            dos.writeChar('a');
            dos.writeDouble(1.1);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
