package day09;

public class ExceptionExam05 {
    //1. 예외가 발생 했고, 이 예외를 잘 처리했을때.
    //2. 예외가 발생 했고, 그것을 처리하지 못했을 때.
    //3. 예외가 발생하지 않았을때.

    //finally{} 블럭은 어떤 경우에도 반드시 실행된다.
    public static void main(String[] args) {
        int[] iarr = {1,2,3};
        try {
            System.out.println("try start");

            int i = iarr[2]/1;

            System.out.println(iarr[2]);



            System.out.println("try end!!");
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }finally {
            System.out.println("반드시 실행되는 블럭!!");
        }


        System.out.println("다음 할일 1");
        System.out.println("다음 할일 2");
        System.out.println("다음 할일 3");
        System.out.println("끝!!");

    }
}
