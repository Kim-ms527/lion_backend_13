package day10;

public class Box {
    Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.setItem(new Pen());

        ((Pen)box.getItem()).쓰다();
    }
}
