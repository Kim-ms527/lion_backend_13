package day07;

public class ShapeTest {
    public static void main(String[] args) {
//        Shape shape = new Shape();   //추상클래스는 인스턴스화가 불가능!!
        //추상클래스는 인스턴스화만 안되는 것이고,  나머지는 클래스와 똑같이 사용됨.
        //타입으로의 역할은 가능하다.
        Shape shape = new Circle("blue",2.5);

        System.out.println("색상 : "+ shape.getColor());
        System.out.println("면적 : " + shape.getArea() );


        Shape triangle = new Triangle("red",10,5);
        System.out.println(triangle.getArea());


        Rectangle rectangle = new Rectangle("orange", 10, 20);
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getArea());
    }
}
