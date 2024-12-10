package day07;

public class Rectangle extends Shape{
    private double width;
    private double height;



    public Rectangle(String color, double width, double height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그립니다.");
    }
}
