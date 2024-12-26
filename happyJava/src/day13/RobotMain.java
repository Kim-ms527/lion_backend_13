package day13;
//공유객체 로봇
class Robot{
    public synchronized void methodA(){
        for(int i = 0; i < 5; i++){
            System.out.println("method A :: A질문에 대답하는 중 "+i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void methodB(){
        for(int i = 0; i < 5; i++){
            System.out.println("method B :: B질문에 대답하는 중 "+i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public   void methodC(){
        for(int i = 0; i < 10; i++){
            System.out.println("method C ::  C 질문에 대답하는 중 "+i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class RobotPlayer extends Thread{
    private String name;
    private Robot robot;

    public RobotPlayer(String name, Robot robot){
        this.name = name;
        this.robot = robot;
    }
    @Override
    public void run(){
        if("A".equals(name)){
            robot.methodA();
        }else if("B".equals(name)){
            robot.methodB();
        }else{
            robot.methodC();
        }
    }
}

public class RobotMain {
    public static void main(String[] args) {
        Robot robot = new Robot();
        RobotPlayer playerA = new RobotPlayer("A",robot);
        RobotPlayer playerB = new RobotPlayer("B",robot);
        RobotPlayer playerC = new RobotPlayer("C",robot);

        playerA.start();
        playerB.start();
        playerC.start();

    }
}
