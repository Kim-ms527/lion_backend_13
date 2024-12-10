package day07;

public class BallPen extends Pen{
    public int BallPen(){ //리턴타입을 가지면 메소드로 인지한다.  생성자 아님!!!
        return 0;
    }

    public BallPen(){   //생성자로 인지함.

    }
    String color = "검정";
    //부모가 가진 메소드, 필드를 자식이 똑같이 다시 정의 하는 것!!  오버라이드이다.
    public void write(){
        //부모가 이미 구현한 write() 메소드에서

        System.out.println("BallPen이 씁니다. 색:"+color);
    }

    @Override
    public String toString() {
        return "나는 볼펜이예요.";
    }

    public void print(){
        //생성자는 객체가 생성될때 한 번 불려쓰이기때문에
        //생성자에서만 호출이 가능하다.
//        super();
//        this();

//        System.out.println("a");
//        System.out.println("b");
//        System.out.println("c");
//        System.out.println("d");

        super.print();
        System.out.println("e");
        System.out.println(super.color); //접근제한자가 가능하면 접근가능
    }

    public static void main(String[] args) {
//        BallPen ballPen = new BallPen();
        BallPen ballPen = new BallPen();
        System.out.println(ballPen.color);
        ballPen.write();
        ballPen.write("test");
        ballPen.write("test",4);

        ballPen.print();

    }
}
