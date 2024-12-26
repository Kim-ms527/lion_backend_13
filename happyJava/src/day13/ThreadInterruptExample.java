package day13;



public class ThreadInterruptExample {
    static class MyThread extends Thread{
        public void run(){
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                    System.out.println("step :: "+ (i+1));
                }
            } catch (InterruptedException e) {
                System.out.println("스레드가 중단되었습니다.");
                return;  //스레드를 안전하게 종료함
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

//        myThread.stop();  -- 쓰레드를 종료시키는 이 메스드는 불안정하므로 사용하지 않게하고 있다.
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        myThread.interrupt();  //스레드에게 인터럽트 신호를 보내서 안전하게 종료하도록 함.
    }
}
