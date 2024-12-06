package day05;

public class Exam2 {

    public void method1(){

    }

    public void method2(int i){

    }
    public int method3(){


        return 0;
    }
    public static void main(String[] args) {
        Exam.staticTest();

        Exam2 e = new Exam2();

        e.method2(10);

        e.method1();
    }
}
