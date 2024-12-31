package day16;

//전략인터페이스   -  결제방식의 공통 인터페이스
interface PaymentStrategy {
    void pay(int amount);
}
//구체적인 전략 클래스  -  ex) 신용카드, 카카오결제, ..


//Context 클래스   PaymentContext
class PaymentContext{

}


public class StrategyExam {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        //신용카드결제


        //카카오결제


        //또 다른 무언가..


    }
}
