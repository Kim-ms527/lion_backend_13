package day07;

public abstract class Shape {
    protected  String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea(); //어떤 도형이든 면적을 계산하는 기능은 반드시 필요하다라고..
}
