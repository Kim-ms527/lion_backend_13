package day10;

public class GenericBox<I> {
    I item;

    public I getItem() {
        return item;
    }

    public void setItem(I item) {
        this.item = item;
    }

    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<String>();
        genericBox.setItem("abc");
//        genericBox.setItem(new Pen());
        genericBox.getItem().toUpperCase();

        GenericBox<Pen> penGenericBox = new GenericBox<Pen>();
        penGenericBox.setItem(new Pen());
        penGenericBox.getItem().쓰다();

    }
}
