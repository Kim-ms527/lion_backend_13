package day10;

public class PenBox {
    Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public static void main(String[] args) {
        PenBox penBox = new PenBox();
        penBox.setPen(new Pen());
        penBox.getPen().쓰다();  //형변환이 필요없다.
    }
}
