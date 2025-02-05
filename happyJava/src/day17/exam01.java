package day17;

public class exam01 {
    public int test(Integer integer){
        return integer + 10;
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello!!!");
            }
        };

        new Thread(runnable).start();


        Runnable runnable2 = () -> System.out.println("hello");

        new Thread((runnable2)).start();
    }

}
