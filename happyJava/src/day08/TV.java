package day08;

public interface TV {

    public void togglePower();
    public void volumeUp();
    public void volumeDown();
    public void channelUp();
    public void channelDown();
    public void setChannel(int channel);

    public default  void abc(){

    }
}
