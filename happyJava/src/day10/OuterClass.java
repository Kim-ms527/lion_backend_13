package day10;

public class OuterClass {

    private int outerField = 10;
    private InnerCalss innerCalss;

    public void outerMethod(){
        InnerCalss inner = new InnerCalss();
        inner.innerMethood();
    }

    public void test(){
        InnerCalss inner = new InnerCalss();
        inner.innerMethood();
    }
    public class InnerCalss{
        public void innerMethood(){
            System.out.println("outerField : " + outerField);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();
    }
}
