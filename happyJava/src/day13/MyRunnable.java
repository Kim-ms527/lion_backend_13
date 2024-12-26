package day13;

public class MyRunnable implements Runnable{
    String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    //이클래스 자체가 쓰레드는 아니다.
    @Override
    public void run() {
        System.out.println(name+"Runnable 출발");


        for(int i = 0; i < 10; i++){
            System.out.println(name+"Runnable 안녕!!" + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

        System.out.println(name+"Runnable 종료!!");
    }
}
