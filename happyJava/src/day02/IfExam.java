package day02;

public class IfExam {
    public static void main(String[] args) {
        //삼항 연산자
        //(조건)? 식1 : 식2
        int num = -10;
        boolean b = (num > 5) ? true : false;

        String result = (num > 0) ? "양수" : "음수";

        System.out.println(result);

        //조건문 if
        //if(조건식){
        // 실행할 문장
        //}
        System.out.println("===========if=================");
    //어떤 문장은 조건에 만족 될때만 실행 하고 싶어요. 
        if(num >= 0){
            System.out.println("양수"); 
        }else {
            System.out.println("음수");
        }
        System.out.println("===========if=================");

        int num2 = 55;
        if(num2 % 2 == 0) {
            System.out.println("짝수");

            System.out.println("test");

            System.out.println("test");

            System.out.println("test");
        } else if (num2 %  3 == 0) {
            System.out.println("3의 배수");
        } else if (num2 %  5 == 0) {
            System.out.println("5의 배수");
        }else{
            System.out.println("홀수");
        }

        if(num > 10)
            System.out.println(num+"은 10보다 커요.");
        else
            System.out.println(num+"은 10보다 작아요.");
    }
}
