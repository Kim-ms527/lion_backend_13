package day13;

public class CaramiThread extends Thread{

    @Override
    public void run() {
        //이 쓰레드가 할일을 구현함.
        System.out.println("CaramiThread 출발");


        for(int i = 0; i < 5; i++){
            System.out.println("CaramiThread 안녕!!" + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("CaramiThread 종료!!");
    }
}
