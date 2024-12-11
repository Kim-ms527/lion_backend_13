package day08;

public class ExceptionExam02 {
    public static void main(String[] args) {
        int[] iarr = {0,1,2,3};

        try {
            System.out.println(iarr[5]);  //예외가 발생하면, 예외가 발생한 지점부터 try블럭의 코드는 실행되지 않는다.

            int i = iarr[3]/iarr[0];

            System.out.println("try블럭내의 다음 문장");
            System.out.println("try블럭내의 그 다음 문장");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally~~  반드시 실행되는 블럭!!!");
        }

        System.out.println("다음문장");
        System.out.println("그 다음문장");
    }
}
