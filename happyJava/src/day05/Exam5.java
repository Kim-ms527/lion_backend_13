package day05;

public class Exam5 {

//    public void test(int i ){
//
//    }
    public int test(int j ){
        return 0;
    }

    public void test(int i, int j){

    }
    public void test(String x, int i){

    }
    public void test(int i, String x){

    }
    public String test(String x, int i, int j){
        return null;
    }

    public static void test(String s, String s2, String s3){
        System.out.println("333");
    }
    public static void test(String... args){
        System.out.println("[]");

    }


    public static void main(String[] args) {
        test("a","b","c");

//
//        Exam5 e = new Exam5();
//        e.test(10);
//
//        e.test("x",10);
//        e.test(10,"x");

    }

}
