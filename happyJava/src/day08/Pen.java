package day08;

public class Pen {
    public final String 제조사;
    public String name;
    private int price;

    public Pen(){
        제조사 = "모나미";
    }
    public Pen(String 제조사){
        this.제조사 = 제조사;
    }

    public String get제조사() {
        return 제조사;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public final void 쓰다(){
        System.out.println("펜이씁니다.");
    }

    public static void main(String[] args) {
        Pen pen = new Pen();
//        pen.제조사 = "test";
        pen.name = "hahah";
        pen.name = "ballpen";

    }
}
