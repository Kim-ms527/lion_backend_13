package annotation;

public class Service {
    @PrintAnnotaion
    public void methodA(){
        System.out.println("methodA 실행!!!");
    }

    @PrintAnnotaion("@")
    public void methodB(){
        System.out.println("methodB 실행!!!");
    }

    @PrintAnnotaion( number = 10)
    public void methodC(){
        System.out.println("methodC 실행!!!");
    }

    @PrintAnnotaion(value = "#", number = 20)
    public void methodD(){
        System.out.println("methodD 실행!!!");
    }
}
