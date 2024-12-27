package day14;

import org.w3c.dom.ls.LSOutput;

class Rectangle{
    protected int width;
    protected int height;

    public Rectangle(int width, int height){
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
class Square extends Rectangle{
    public Square(int side){
        super(side, side);
    }

    @Override
    public void setWidth(int width) {
        super.width = width;
        super.height = width;
    }

    @Override
    public void setHeight(int height) {
       super.height = height;
       super.width = height;
    }
}

public class LSPDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3,5);
        System.out.println("사각형의 넓이는?  " + rect.area());
        rect.setWidth(6);
        System.out.println(rect.area());

        Rectangle square = new Square(5);
        System.out.println("정사각형의 넓이는? "+square.area());
        square.setWidth(6);

        System.out.println(square.area());
    }

}
