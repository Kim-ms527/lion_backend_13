package day17;

import java.util.function.*;

public class LambdaExam4 {
    public static void main(String[] args) {
//       Predicate  - 입력을 받아서 결과로 boolean을 리턴하는 메서드를 가진 인터페이스
        //조건을 테스트 할때 사용. boolean 반환
        //입력된 값이 음수인지 양수인지 체크하는 메서드를 구현.
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(4));
        System.out.println(isPositive.test(-4));

//        Predicate<Integer> test =  new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return false;
//            }
//        };

        //Consumer
        //입력을 받아서 반환값이 없는 연산을 수행할 때
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("hello carami@@");

        Consumer<String> printer2 = System.out::println;
        printer2.accept("hello hahah");

        //Function
        //입력을 받아서 연산해서 출력하는
//        Function<String, Integer> lengthFunc = s -> s.length();
        Function<String, Integer> lengthFunc = String::length;
        System.out.println(lengthFunc.apply("hello carami!!"));

        //Supplier
        //입력없이 값을 반환
//        Supplier<Double> randomSupplier = ()->Math.random();
        Supplier<Double> randomSupplier = Math::random;
        System.out.println(randomSupplier.get());

        IntSupplier intSupplier = ()->(int)(Math.random()*6)+1;
        System.out.println(intSupplier.getAsInt());

//        IntSupplier intSupplier2 = new IntSupplier() {
//            @Override
//            public int getAsInt() {
//                return 0;
//            }
//        };

        //BiFunction
        //값을 두개 입력 받고, 하나의 결과값을 반환
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a+b;
        System.out.println(add.apply(5,3));

        //Consumer 의 andThen 메서드
        Consumer<String> conA = s -> System.out.println(s + "aaaa");
        Consumer<String> conB = s -> System.out.println(s + "bbbb");
        conA.accept("carami");
        conB.accept("carami");

        Consumer<String> conAB = conA.andThen(conB);

        conAB.accept("hello");

    }
}
