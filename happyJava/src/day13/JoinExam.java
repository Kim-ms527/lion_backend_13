package day13;

class SumThread extends Thread{

    // 이  쓰레드는  엄청 복잡한 계산을 해주는 일을 한다.

    @Override
    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("계산종료!!");
    }
}

public class JoinExam {
    public static void main(String[] args) {
        System.out.println("main이 일을 시작합니다.");
        System.out.println("복잡한 계산을 해야하는 일을 만났습니다.");

        SumThread sumThread = new SumThread();
        sumThread.start();

        System.out.println("sumThread가 계산하는 동안 할일을 진행.. ");

        try {
            sumThread.join();   // sumThread가 일을 끝낼때까지 기다리게 해줍니다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //sumThread가 종료된 후에.. 실행되어야함.
        System.out.println("SumThread에서 계산을 끝냈습니다!!! 결과는.... 입니다.");
    }

}
