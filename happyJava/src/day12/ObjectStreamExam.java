package day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExam {
    public static void main(String[] args) {
        //객체를 파일에 저장 하고 싶어요.  객체 직렬화
        Person kang = new Person("kang",20);
        try(
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt"));
                ){
            out.writeObject(kang);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //파일에서 객체를 읽어 오고 싶어요.
        Person readPerson = null;
        try(
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.txt"));
                ){
            readPerson = (Person) in.readObject();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(readPerson);
        System.out.println(readPerson.getName());



    }
}
