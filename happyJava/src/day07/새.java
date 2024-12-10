package day07;

abstract public class 새 {  // 구체적?  추상적?
    private String name;
    private int age;

    public void 먹다(){
        System.out.println("새가 먹는다");
    }
    public void 날다(){
        System.out.println("새가 날아요^^");
    }
//

    //자식클래스들이 표준화된 방법으로 노래하다라는 메소드를 정의!! (표준화)
    //자식클래스는 노래하다라는 메소드를 반드시 구현해야한다. (강제성)
    abstract public void 노래하다();  //구현부가 없다!!   설계가 미완성된 상태!!

    public void 애교를부리다(){

    }
}
