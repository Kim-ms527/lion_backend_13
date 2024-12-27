package day14;

import java.io.FileWriter;

class Person{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    //유저정보 출력
    public void printPerson(){
        System.out.println("Person::"+name);
    }

    //파일에 유저정보 저장
//    public void saveUserToFile(){
//        try(FileWriter writer = new FileWriter("person.txt")){
//            writer.write("person: "+name);
//        } catch (Exception e) {
//            System.out.println("파일 저장중 오류 발생 ::"+e.getMessage());
//        }
//
//    }

}
class FileManager{
    public void saveToFile(String fileName, String content){
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write(content);
        } catch (Exception e) {
            System.out.println("파일 저장중 오류 발생 ::"+e.getMessage());
        }
    }
}

public class SRPExam {
    public static void main(String[] args) {
        Person person = new Person("kang");
        person.printPerson();
//        person.saveUserToFile();

        FileManager fileManager = new FileManager();
        fileManager.saveToFile("p1.txt","person: "+person.getName());


    }
}
