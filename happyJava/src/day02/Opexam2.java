package day02;

public class Opexam2 {
    public static void main(String[] args) {
        //조건문
        //if, 삼항 연산자, switch.
        if(false){
            System.out.println("실행!!");
        }else{
            System.out.println("false 라면 여기 실행!!");
        }
        
        int num = 10;
        
        if(num % 2 == 0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
                    
        }

        if(num % 2 == 0){
            System.out.println("2의 배수");
        }else if(num % 3 == 0){
            System.out.println("3의 배수");
        }else if(num % 5 == 0){
            System.out.println("5의 배수");
        }else if(num % 7 == 0){
            System.out.println("7의 배수");
        }else {
            System.out.println("3의 배수");
        }

        //삼항 연산자 .
        //(조건)? 값1 : 값2
        boolean flag =  (num % 2 == 0)?true:false;

        String result =  (num % 2 == 0)?"짝수":"홀수";
        int a = 10;

        //변수는 범위를 갖는다.
        int value=0;
        if(a > 5){
            value = 20;
        }else{
            value = 30;
        }

        System.out.println(value);


    }
}
