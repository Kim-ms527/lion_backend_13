package day08;

public class ABCImpl implements InterA,InterB,InterC{
    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void mehtodC() {

    } //인터페이스는 여러개 구현이 가능하다.

    public static void main(String[] args) {
        ABCImpl abc = new ABCImpl();
        abc.methodB();
        InterA interA = abc;
        interA.methodB();
        InterB interB = abc;
        interB.methodB();
        InterC interC = abc;
        interC.mehtodC();

        System.out.println(InterA.I);
        System.out.println(InterB.I);
        System.out.println(InterC.I);
    }
}
