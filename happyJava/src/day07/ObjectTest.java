package day07;
//Object
class Cup extends Object{
    String name;
    int price;

    @Override
    public String toString() {
        return "나는 컵이예요.";
    }
}

public class ObjectTest {
    public static void main(String[] args) {
        Cup cup = new Cup();

        //출력문에 객체 이름을 넣으면 toString() 이라는 메소드가 자동으로 호출된다!!
        System.out.println(cup);
        System.out.println(cup.toString());

        Pen pen = new Pen();
        System.out.println(pen);
        System.out.println(pen.toString());

        BallPen ballPen = new BallPen();
        System.out.println(ballPen);

        int i = 10;

        System.out.println(i);


        String str = "hello";

        System.out.println(str);


    }
}
