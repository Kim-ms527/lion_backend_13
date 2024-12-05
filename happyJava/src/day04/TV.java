package day04;

public class TV {
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
