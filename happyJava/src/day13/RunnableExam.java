package day13;

public class RunnableExam {
    public static void main(String[] args) {
        System.out.println("main Thread 출발");

       //MyRunnable은 Thread는 아니므로..   혼자서 쓰레드가 될 수는 없다.
        Thread thread = new Thread(new MyRunnable("철수"));
        thread.start();

        Thread thread2 = new Thread(new MyRunnable("영희"));
        thread2.start();


        for(int i = 0; i<10; i++){
            System.out.println("main 안녕"+ i);

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

        System.out.println("main Thread 종료!!");
    }
}
