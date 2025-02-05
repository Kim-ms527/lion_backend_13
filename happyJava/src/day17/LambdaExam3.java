package day17;

public class LambdaExam3 {
    public static void main(String[] args) {
//        IntBinaryOperation add = new IntBinaryOperation() {
//            @Override
//            public int apply(int a, int b) {
//                return a+b;
//            }
//        };

        IntBinaryOperation add = (a,b)->a+b;
        IntBinaryOperation minus = (a, b) -> a-b;
        IntBinaryOperation multiply = (a,b) -> a* b;

        System.out.println(add.apply(3,2));
        System.out.println(minus.apply(3,2));
        System.out.println(multiply.apply(3,2));
    }
}
