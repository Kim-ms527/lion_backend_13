package day14;

//전기차가 차를 상속받게 되면서..  부모가 가지고 있는 메서드가 대체 될 수 없는 문제를 가지게 된다.  이럴경우에는
//서로 상속 관계를 갖게하는 것이 바람직하지 않다.

//추상클래스 - 다른 구현부들도 가지고 있음...
//전기차와 일반차의 일반화를 생각해볼 수 있을거다.
abstract class Vehicle{
    //차와 전기차가가  가져야하는 일반적인 속성이나 기능들을 여기 구현!!

    public abstract void drive();
}


class Car extends Vehicle{
    private int fuel;

    public Car(int fuel){
        this.fuel = fuel;
    }

    public void drive(){
        if(fuel > 0){ //연료가 0 이상일때만 운행가능
            fuel--; //운행시 연료감소
            System.out.println("자동차가 운행 합니다.  남은 연료량 : "+fuel);
        }else {
            System.out.println("운행할 수 없습니다.  연료가 없어요.ㅠㅠ ");
        }
    }
}

//Car를 상속받는 :ElectricCar 객체를 만들어 보세요.
// 전기 자동차는 연료 대신 배터리로 동작하며,  베터리가 소모됩니다.
//Car클래스의 메소드를 오버라이딩 해서 운행시 베터리에 맞게 수정해주세요.
//이 때..  해당 설계가 LSP 를 위한 할 가능성이 있는지 고민해보고,  위반 여부를 판단해 보세요.
class ElectricCar extends Vehicle {
    private int batteryLevel;
    public ElectricCar(int batteryLevel){
        this.batteryLevel = batteryLevel;
    }

    public void drive() {
        if(batteryLevel > 0 ){
            batteryLevel--;
            System.out.println("전기차가 달립니다. 남은 베터리량 : "+batteryLevel);
        }else {
            System.out.println("베터리가 없어서 운행 할 수 없습니다.");
        }
    }
}


public class LSPExam {
    public static void main(String[] args) {
        Vehicle car = new Car(5);  //일반 자동차
        car.drive();  // 정상운행

        Vehicle electricCar = new ElectricCar(40);  //전기자동차
        electricCar.drive();  //전기자동차로 대체되어도 문제없지 동작하도록 구현
    }

}
