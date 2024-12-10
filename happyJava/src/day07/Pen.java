package day07;

public class Pen {
    protected String color = "빨강";
    public void write(){
        System.out.println("Pen이 씁니다.");
    }
    public void write(String msg){

    }
    public void write(String msg, int count){

    }

    @Override
    public String toString() {
        return "나는 펜이예요.";
    }

    public void print(){
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
        System.out.println("d");
    }
}
