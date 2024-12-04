package day03;

public class ItemForArray {
    //클래스의 가장 기본이 되는 구성요소
    //데이터(속성)를 나타내는 필드
    private int price;
    private String name;
    //int i  = 10;   --  초기화
    //생성자 --  객체를 초기화 하는 메소드.  객체가 생성될 때 딱 한 번 실행된다.
    //접근제한자 메서드명(클래스명과 동일) (매개변수들..){}
    public ItemForArray(int price, String name){
        this.price = price;
        this.name = name;
    }






    //메서드.  getter
    //접근제한자 리턴타입 메소드명(매개변수들..){  }

    //public  커피  makeCoffee(커피콩, 물 ){ 커피콩을 간다..  물을 끓인다... }
    // 밥 make밥(씻은쌀, 물 ){ ...   }

    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
//    //setter  void - 예약어. (없다)
//    public void setPrice(int price){
//        this.price = price;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
}
