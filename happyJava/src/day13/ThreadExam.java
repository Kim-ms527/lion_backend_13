package day13;

public class ThreadExam {
    public static void main(String[] args) {
        System.out.println("main Thread 출발");

        //쓰레드 생성
        MyThread myThread = new MyThread("철수");
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();  // run을 직접 호출하지 않는다.
        // start()라는 메서드가 실제 수행 흐름을 하나 만들어내는 일을 하고, 준비가 되면 run()호출한다.


        MyThread myThread2 = new MyThread("영희");
        myThread2.setPriority(1);
        myThread2.start();  // run을 직접 호출하지 않는다.

//        CaramiThread caramiThread = new CaramiThread();
//        caramiThread.start();
        System.out.println("===========================");
        System.out.println(myThread2.getPriority());
        System.out.println(myThread.getPriority());
//        myThread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("============================");

        for(int i = 0; i<10; i++){
            System.out.println("main 안녕"+ i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("main Thread 종료!!");
    }
}
