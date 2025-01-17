package tv;

public class TVUser {
    public static void main(String[] args) {
        TV tv = TVFactory.getTV(args[0]);
//        TV tv = new LTV();

        tv.turnOn();
        tv.soundUp();
        tv.soundDown();
        tv.turnOff();
    }
}
