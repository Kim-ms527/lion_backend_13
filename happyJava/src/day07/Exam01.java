package day07;

public class Exam01 {
    public static void test(Pen pen){

    }
    public static void test2(BallPen ballPen){

    }

    public static  void test3(Object obj){
        if(obj instanceof Pen)
            ((Pen)obj).write();
        else
            System.out.println("Pen 만 쓸 수 있어요!!!");
    }

    public static void main(String[] args) {
        Pen pen = new Pen();   //1
        BallPen ballPen = new BallPen(); //2
        String str = "hello";  //3
        Object obj = new Object(); //4

        test(pen);
        test(ballPen);  //Pen과 Pen의 자손은 가능
        test2(ballPen);
        test3(pen);
        test3(ballPen);
        test3(str);
        test3(obj);
    }
}
