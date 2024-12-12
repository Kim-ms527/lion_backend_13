package day09;

public class ExceptionExam03 {
    //메서드가 실행되는 동안에 예외가 발생할 수 있다.
    public static void methodA() throws RuntimeException{
        //예외가 발생할 때 이 메서드를 호출한 쪽에 예외처리를 맡기는 경우 - unchecked Exception이 발생한 경우
    }

    public static void methodB() throws Exception{
        //예외가 발생할 때 이 메서드를 호출한 쪽에 예외처리를 맡기는 경우 - checked Exception이 발생한 경우

    }

    public static void methodC(){
        //예외가 발생했지만, 메서드 내에서 처리한 경우.
        try{

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        methodA();

        try {
            methodB();
        } catch (Exception e) {
            System.out.println(e);
        }

        methodC();
    }
}
