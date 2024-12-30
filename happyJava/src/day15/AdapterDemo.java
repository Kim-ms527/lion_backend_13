package day15;
//Adaptee  --  기존 코드나 시스템 (집에서 가져간 드라이기)  -- 해외여행가서 직접사용 불가!!
class Power220v{
    public void  connect(){
        System.out.println("내가 집에서 가져간 드라이기로 머리 말림!! ");
    }
}

//target - 클라이언트가 기대하는 인터페이스  110v
interface Power110v{
    void supply();
}

//Adapter - Adaptee의 인터페이스를 Target의 인터페이스로 변환해주는 클래스
class PowerAdater implements Power110v{
    private Power220v power220v;
    public PowerAdater(Power220v power220v){
        this.power220v = power220v;
    }
    @Override
    public void supply() {
        System.out.println("어댑터를 사용해서 220v를 110v 로 변환.... ");
        power220v.connect();
    }
}


public class AdapterDemo {
    public static void main(String[] args) {
        Power220v power220v = new Power220v();  //집에서 가져간 드라이기
        Power110v adapter = new PowerAdater(power220v);
        adapter.supply();
    }
}
