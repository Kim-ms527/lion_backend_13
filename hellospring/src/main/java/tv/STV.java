package tv;

public class STV implements TV{
    @Override
    public void turnOn() {
        System.out.println("STV");
    }

    @Override
    public void turnOff() {
        System.out.println("STV");
    }

    @Override
    public void soundUp() {
        System.out.println("STV");
    }

    @Override
    public void soundDown() {
        System.out.println("STV");
    }
}
