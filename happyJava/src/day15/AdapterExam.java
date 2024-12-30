package day15;

//기존 전자기기의 인터페이스
interface ElectronicDevice{
    void turnOn();
}
//기존 전자기기 클래스
class OldDevice implements  ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("기존 전자기기가 켜집니다. ");
    }
}

//새로운 전자기기
class NewDevice{
    public void powerOn(){
        System.out.println("새로운 전자기기가 켜집니다.  ");
    }
}
//Adapter class 구현해 볼까요?
//이렇게 adapter를 사용해서 기존코드와 새코드가 전혀 수정되지 않고도 서로 호환 되도록 하고 있죠~~
class DeviceAdapter implements ElectronicDevice{
    private final NewDevice newDevice;
    public DeviceAdapter(NewDevice newDevice){
        this.newDevice = newDevice;
    }

    @Override
    public void turnOn() {
        newDevice.powerOn();
    }
}


public class AdapterExam {
    public static void main(String[] args) {
        //기존 전자 기기
        ElectronicDevice oldDevice = new OldDevice();
        oldDevice.turnOn();




        //새로운 전자기기!!
        //trunOn()을 이용해서 새로운 전자기기도 사용하고 싶다.
        NewDevice newDevice = new NewDevice();
        ElectronicDevice adpterDevice = new DeviceAdapter(newDevice);  //어댑터에 새 기기를 넣어서 사용.
        adpterDevice.turnOn();
    }
}
