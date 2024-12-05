package day04;

public class Exam3 {
    // 메소드 - 기능 (행위)
    //정수값 2개를 받아서 더해주는 기능을 구현하고  싶다.
    //접근제한자 리턴타입 메소드명(매개변수들){구현부}
    public static int addInt(int value1, int value2){  //객체를 생성하지 않아도 사용가능하도록!!
        System.out.println("addInt(int value1, int value2)");
        int sum = value1+value2;
        return sum;
    }

    public static int addInt(int v1, int v2, int v3){
        System.out.println("addInt(int v1, int v2, int v3)");
        return v1+v2+v3;
    }

    public static int addInt(int... values){
        int sum = 0;

        for(int value : values){
            sum += value;
        }

        return sum;
    }



    //main 메소드
    public static void main(String[] args) {
       int result =  addInt(4,5);
        System.out.println(result);
        System.out.println(addInt(6,4));
        System.out.println(addInt(8,4));

        System.out.println(addInt(2,4,6));

        System.out.println(addInt(4,6,7,4));
        System.out.println(addInt(4,6,3,6,78,3,5,7));
    }
}
