package day07;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(String color,double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base*height)/2;
    }

    @Override
    public void draw() {
        System.out.println("삼각형을그립니다.");
    }
}
