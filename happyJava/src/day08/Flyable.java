package day08;

public interface Flyable {
    public int A = 10;  // final static 생략됨 (상수)


    public void 날다();



    public default  void test(){}
    public static void stest(){}
}
