package day10;
interface Greeter{
    void greet();
}
public class Exam02 {
    public static void main(String[] args) {
        Greeter morningGreeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("좋은아침!!");
            }
        };

        Greeter eveningGreeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("좋은저녁!!");
            }
        };

        morningGreeter.greet();
        eveningGreeter.greet();
    }
}
