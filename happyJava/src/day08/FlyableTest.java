package day08;

public class FlyableTest {
    public static void main(String[] args) {
        //Interface는 객체생성이 될까요?  -- 당연히 안되겠죠?
        //타입으로 사용이 가능하다.

        Flyable flyable = new 나비();
        Flyable flyable1 = new 드론();
        Flyable flyable2 = new 비행기();

        flyable2.날다();

        //인터페이스로 날다 라는 기능이 표준화되었기 때문에.. 비행기, 드론, 나비를 다 같은 방식으로 날게 할 수 있다.

        flyable.날다();
        flyable1.날다();


        //


    }
}
