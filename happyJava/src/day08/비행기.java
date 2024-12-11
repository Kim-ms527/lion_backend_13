package day08;

public class 비행기 implements Flyable{

    public void 착륙하다(){
        System.out.println("착륙하다.");
    }
    @Override
    public void 날다() {
        System.out.println("비행기가 납니다");
    }
}
