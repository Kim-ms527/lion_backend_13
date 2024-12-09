package day06;

public class Exam06 {
    public static void test(Parent p){
        System.out.println(p.i);
        System.out.println(p.getI());
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.i);
        System.out.println(p.getI());

        Child c = new Child();
        System.out.println(c.i);
        System.out.println(c.getI());

        Parent pc = new Child();
        System.out.println(pc.i);
        System.out.println(pc.getI());

        System.out.println("=======================================");
        test(p);

        System.out.println("=======================================");
        test(c);

        System.out.println("=======================================");
        test(pc);
    }
}
