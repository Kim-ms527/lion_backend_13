package tv;

public class LTV implements TV{
    @Override
    public void turnOn() {
        System.out.println("LTV");
    }

    @Override
    public void turnOff() {
        System.out.println("LTV");
    }

    @Override
    public void soundUp() {
        System.out.println("LTV");
    }

    @Override
    public void soundDown() {
        System.out.println("LTV");
    }
}
