package day02;

public class WhileExam {
    public static void main(String[] args) {
        //while(조건식){ 반복할 문장 }  - 무한루프에 빠지지 않도록 사용해야한다.
        int count = 0;
        while(count++ < 5 ){
            System.out.println(count);
//            count++;
        }
    }
}
