package day17;

//public int method(int x, int y) ;  형태의 메소드를 가진 FunctionalInterface를
// 하나 정의하고 이 인테페이스를 사용하는 코드를 작성해보세요.




public class MyFunctionalInterfaceTest {
    public static void testMethod(MyFunctionalInterface f,int number){
        f.method(number);
    }
    public static void main(String[] args) {

        testMethod(a-> {
            int result = a * 3;
            System.out.println(result);
        },6);



        MyFunctionalInterface fi;

        fi = new MyFunctionalInterface() {
            @Override
            public void method(int x) {
                int result = x * 5;
                System.out.println(result);
            }
        };

        fi.method(5);

        fi = (int x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi =  x -> {
            int result = x * 5;
            System.out.println(result);
        };



    }
}
