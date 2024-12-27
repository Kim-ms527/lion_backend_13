package day14;
interface PaymentMethod{
    void pay(int amount);
}

class CreditCard implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("신용카드로 결제 합니다. : "+ amount);
    }
}

class PayPal implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("페이팔로 결제합니다. : "+ amount);
    }
}

class BitCoin implements PaymentMethod{
    @Override
    public void pay(int amount) {
        System.out.println("비트코인으로 결제합니다. : "+ amount);
    }
}


//결제프로세서는 PaymentMethod의 타입만 알고있으면됨..   구체적인 결제방싱은 몰라도 됨..
class PaymentProcessor{
    public void process(PaymentMethod method, int amount){

        method.pay(amount);



//        //새로운 결제 수단이 추가 될때 마다...  해당 코드가 수정되어야 함..
//        //이런 설계는 OCP 에 위반되는 설계. (기존 코드는 변경에 닫혀있어야 하는데...)
//        if(method.equalsIgnoreCase("CreditCard")){
//            System.out.println("신용카드로 결제 합니다. : "+ amount);
//        } else if (method.equalsIgnoreCase("paypal")) {
//            System.out.println("페이팔로 결제합니다. : "+ amount);
//        }else{
//            System.out.println("지원하지 않는 결제 방식입니다.");
//        }
    }
}
public class OCPDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
//        processor.process("creditCard",100);
//        processor.process("paypal",4000);
//
//        //새로운 결제 수단을 추가하고 싶다면???
//        processor.process("bitcoin",500);

        processor.process(new CreditCard(),100);
        processor.process(new PayPal(), 4000);

        //새로운 결제수단을 추가 한다..
        processor.process(new BitCoin(),500);

    }
}
