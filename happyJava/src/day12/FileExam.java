package day12;

import java.io.File;
import java.io.IOException;

public class FileExam {
    public static void main(String[] args) {
        File file = new File("test.txt");

        System.out.println(file.exists());
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("새로운 파일이 생성 되었습니다. : "+ file.getAbsolutePath());
            }
            //File 객체를 통해서 파일 정보를 확인 할 수 있다.
            System.out.println("파일 이름 :"+file.getName());
            System.out.println("파일 크키 :"+file.length()+"bytes");
            System.out.println("읽기 가능 : " + file.canRead());
            System.out.println("쓰기 가능 : " + file.canWrite());
            System.out.println("디렉토리 유뮤 :"+file.isDirectory());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(System.getProperty("user.dir"));

        File dir = new File("."); //. 이 의미하는거 알고 있나요?  //현재디렉토리
        System.out.println(dir.isDirectory());
        String[] files = dir.list();

        for(String f: files){
            System.out.println(f);
        }
    }
}
