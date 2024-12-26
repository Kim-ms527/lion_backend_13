package day13;

public class MyThread extends Thread{
    String name;
    MyThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        //이 쓰레드가 할일을 구현함.
        System.out.println(name+"Thread 출발");


        for(int i = 0; i < 10; i++){
            System.out.println(name+"Thread 안녕!!" + i);
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

        System.out.println(name+"Thread 종료!!");
    }
}
