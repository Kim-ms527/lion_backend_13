package day08;

public class ExceptionExam01 {
    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
        }catch (Exception e){
            System.out.println("예외처리 로직");
        }
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        
        //예외 --  이해되고 있나요?
        
    }
}
