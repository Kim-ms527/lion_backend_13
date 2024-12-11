package day08;

public class AAAImplTest {
    public static void main(String[] args) {
        AAAImpl aa = new AAAImpl();

        System.out.println(aa instanceof AAAImpl);
        System.out.println(aa instanceof InterA);
        System.out.println(aa instanceof InterB);
        System.out.println(aa instanceof InterABC);

        System.out.println("============================");

        ABCImpl abc = new ABCImpl();
        System.out.println(abc instanceof InterABC);
    }
}
