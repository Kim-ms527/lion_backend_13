package day06;

public class Pen {
    private String color;
    private String name;
    private int price;

    // 생성자  --  명적적으로 생성자를 정의하지 않으면 컴파일러는 디폴트 생성자를 자동으로 만든다.
    public Pen(){}  // 생성자가 하나라도 만들어지면 기본 생성자는 자동으로 생성되지는 않는다.

    //Pen 이라는 클래스가 만들어(인스턴스화)질때부터 초기값을 갖고싶다.
    public Pen(String name){
        this.name = name;
    }


    //생성자  접근제한자 메소드명=클래스명(매개변수들..  - 초기화할 값들..)
    // color, price  초기화되면 좋겠다.
    public Pen(String color, int price){
       this.color = color;
       this.price = price;
    }
    public Pen(String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
