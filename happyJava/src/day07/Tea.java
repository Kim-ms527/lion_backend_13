package day07;

public class Tea extends Beverage{
    @Override
    void brew() {
        System.out.println("차를 우려냅니다.");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가합니다.");
    }
}
