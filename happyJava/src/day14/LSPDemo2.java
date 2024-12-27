package day14;
interface Shape{
    int area();
}
class Rectangle2 implements Shape{
    private int width;
    private int height;

    public Rectangle2(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int area(){
        return width * height;
    }
}

//Square  --  정사각형
class Square2 implements Shape{
    private int side;
    public Square2(int side){
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side*side;
    }
}

public class LSPDemo2 {
    public static void main(String[] args) {
        Shape rect = new Rectangle2(3,5);
        System.out.println("사각형의 넓이는?  " + rect.area());
//        rect.setWidth(6);
        System.out.println(rect.area());

        Shape square = new Square2(5);
        System.out.println("정사각형의 넓이는? "+square.area());
//        square.setWidth(6);

        System.out.println(square.area());
    }

}
