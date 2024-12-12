package day09;

//사용자 정의 예외객체를 생성하는 방법은??  Exception 을 상속받으면 예외가 된다.
public class MyException extends Exception{
    public MyException(){
        super("MyException 예외");

    }
    public MyException(String msg){
        super(msg);
    }
}
