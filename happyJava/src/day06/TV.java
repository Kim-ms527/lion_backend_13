package day06;

public class TV {
    //power, channel, volume 의 값을 생성자로 추가해주세요.
//생성자 오버로딩 된다.
    //생성자가 다른 생성자를 호출 할 수 있다.  this() -- 나의 생성자를 의미한다.
    public TV(boolean power, int channel, int volume) {
        System.out.println(" TV(boolean power, int channel, int volume) 생성자 호출");
        this.power = power;
        this.channel = channel;
        this.volume = volume;
    }
    public TV(boolean power, int channel) {
        this(power,channel,0);
        System.out.println(" TV(boolean power, int channel) 생성자 호출");
//        this.power = power;
//        this.channel = channel;
    }

    public TV(boolean power) {
        this(power,0,0);
        System.out.println(" TV(boolean power) 생성자 호출");
//        this.power = power;

    }
    public TV(){
        System.out.println(" TV() 생성자 호출");

    }

    //전원,채널,소리
    private boolean power;
    private int channel;
    private int volume;

    //전원을켜다,끄다  소리를 줄이다, 소리를 키우다, 채널을 바꾸다.
//    public void trunOn(){
//        power = true;
//    }
//    public void turnOff(){
//        power = false;
//    }
    public void togglePower(){
        power = !power;
        if(power) {
            System.out.println("TV가 켜졌습니다.");
        }else{
            System.out.println("TV가 꺼졌습니다.");
        }
    }

    public void volumeUp(){
        if(power) {
            volume++;
            System.out.println("볼륨을 키웁니다." + volume);
        }
    }

    public void volumeDown(){
        volume--;
        System.out.println("볼륨을 줄입니다."+volume);
    }

    public void channelUp(){
        channel++;
        System.out.println("채널이 바뀌었습니다."+channel);
    }
    public void channelDown(){
        channel--;
        System.out.println("채널이 바뀌었습니다."+channel);
    }
    public void setChannel(int channel){
        this.channel = channel;
        System.out.println("채널을 돌립니다."+channel);
    }


    public static void main(String[] args) {
        System.out.println("TV의 메인!!!");
    }

}
