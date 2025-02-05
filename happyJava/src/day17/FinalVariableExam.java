package day17;

public class FinalVariableExam {
    public static void main(String[] args) {
        int x = 10;

        Runnable r = () ->{
            System.out.println("x : "+ x);
        };

//        x = 20;
        r.run();
    }
}
