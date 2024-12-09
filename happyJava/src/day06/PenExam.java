package day06;

public class PenExam {
    public static void main(String[] args) {
        Pen p1 = new Pen();  //Pen()  --  생성자

        Pen p2 = new Pen("monami");

        Pen p3 = new Pen("monami","black",2000);

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());
        System.out.println(p3.getColor());
        System.out.println(p3.getPrice());

        Pen p5 = new Pen("blue",4000);

//        this  -  예약어.   인스턴스를 가리키는 예약어.

    }
}
