package day10;
abstract class Cup{
    abstract void 마시다();
}

class mugCup extends  Cup{

    @Override
    void 마시다() {

    }
}
public class Exam01 {
    public static void main(String[] args) {
        Cup cup = new Cup() {
            @Override
            void 마시다() {

            }
        };
    }
}
