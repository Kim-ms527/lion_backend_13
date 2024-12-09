package day06;
//자바는 다중상속을 허용하지 않는다.

class Car {
    String name;
    int speed;

    public void 운행하다(){
        System.out.println("차가달립니다.");
    }
}

class Bus extends Car{   //extends 클래스명    상속 문법.  Bus는 Car로 부터 상속받는다.
    public void 승객을태우다(){
        System.out.println("손님이 탑니다.");
    }
}
class SeatBus extends Bus{
    public void 좌석을예약하다(){
        System.out.println("좌석이 예약 되었습니다.");
    }
}

class Truck extends Car{
    public void 짐을싣다(){
        System.out.println("짐을 싣습니다.");
    }
}
public class Exam01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "티코";
        car.speed = 100;
        System.out.println(car.name);
        System.out.println(car.speed);




        car.운행하다();
//        car.승객을태우다();

        Bus bus = new Bus();
        bus.name="스쿨버스";
        bus.speed = 80;

        System.out.println(bus.name);
        System.out.println(bus.speed);
        bus.운행하다();
        bus.승객을태우다();

        Truck truck = new Truck();
        truck.짐을싣다();
        truck.운행하다();

        //부모(조상)는 자식(자손)을 가리킬(담을) 수 있다.
        Car c = new Car();
        Car c2 = new Bus();
        Car c3 = new Truck();

        Truck t = new Truck();
//        Truck t2 = new Bus();
//        Truck t3 = new Car();

        SeatBus seatBus = new SeatBus();
        seatBus.name = "";
        seatBus.승객을태우다();
        seatBus.좌석을예약하다();

        //부모(조상)는 자식(자손)을 가리킬(담을) 수 있다.
        Car sb1 = new SeatBus();
        Bus sb2 = new SeatBus();

        Object obj = new Car();
        Object obj2 = new Bus();
        Object obj4 = new SeatBus();


        if(obj4 instanceof SeatBus) {
            SeatBus ss = (SeatBus) obj4;
            ss.좌석을예약하다();

            ((SeatBus) obj4).좌석을예약하다();
        }



        seatBus.좌석을예약하다();

        SeatBus sb = (SeatBus) sb1;
        sb.좌석을예약하다();

        ((SeatBus)sb1).좌석을예약하다();   //사용불가!!


    }
}
