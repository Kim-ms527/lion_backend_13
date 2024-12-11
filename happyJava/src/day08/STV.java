package day08;

public class STV  implements TV{
    //전원,채널,소리
    private boolean power;
    private int channel;
    private int volume;


    public void togglePower(){
        power = !power;
        if(power) {
            System.out.println("STV가  켜졌습니다.");
        }else{
            System.out.println("STV가 꺼졌습니다.");
        }
    }

    public void volumeUp(){
        if(power) {
            volume++;
            System.out.println("STV가 볼륨을 키웁니다." + volume);
        }
    }

    public void volumeDown(){
        volume--;
        System.out.println("STV가 볼륨을 줄입니다."+volume);
    }

    public void channelUp(){
        channel++;
        System.out.println("STV가 채널이 바뀌었습니다."+channel);
    }
    public void channelDown(){
        channel--;
        System.out.println("STV가 채널이 바뀌었습니다."+channel);
    }
    public void setChannel(int channel){
        this.channel = channel;
        System.out.println("STV가 채널을 돌립니다."+channel);
    }


}
