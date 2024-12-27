package day14;
//OCP를 적용해 보세요.
//할인 정책이 확장 가능 하도록
//기존의 코드가 수정되지 않고도 새로운 할인 정책이 추가 될 수 있도록 수정 해 주세요.
interface DiscountPolicy{
    double applyDiscount(int price);
}
//학생할인
class StudentDiscouont implements DiscountPolicy{
    @Override
    public double applyDiscount(int price) {
        return price * 0/9;
    }
}

class SeniorDiscount implements DiscountPolicy{
    @Override
    public double applyDiscount(int price) {
        return price * 0.85;
    }
}

class NoDiscount implements DiscountPolicy{
    @Override
    public double applyDiscount(int price) {
        return price;
    }
}

class ExamDiscount implements  DiscountPolicy{
    @Override
    public double applyDiscount(int price) {
        return price * 0.75;
    }
}

class DiscountCalculator{
    public double calculateDiscount(DiscountPolicy discountType, int price){
        return discountType.applyDiscount(price);
    }


//    public double calculateDiscount(String discountType, int price){
//        if("student".equalsIgnoreCase(discountType)){
//            return price * 0.9;  //학생할인 10%
//        } else if ("senior".equalsIgnoreCase(discountType)) {
//            return price * 0.85; //15%
//        }else{
//            return price;
//        }
//    }
}

public class OCPExam {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

//        System.out.println("학생 할인 : "+calculator.calculateDiscount("student",1000));
//
//        System.out.println("할인 없음 : "+ calculator.calculateDiscount("None",2000));

        DiscountPolicy studentPolicy = new StudentDiscouont();
        DiscountPolicy seniorPolicy = new SeniorDiscount();

        System.out.println("학생 할인 : "+calculator.calculateDiscount(studentPolicy,1000));
        System.out.println("어르신 할인 : "+calculator.calculateDiscount(seniorPolicy,2000));


        //수능  할인,  블랙프라이데이 할인 정책을 추가하고 자 할때~~

        System.out.println("수능할인 : "+calculator.calculateDiscount(new ExamDiscount(),5000));

        


    }
}
