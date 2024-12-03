package day02;

public class PrimitiveCastExam1 {
    public static void main(String[] args) {
        int i = 10;
        //형변환 - 작은 그릇에 담김값을 큰 그릇으로 옮겨담을때는 묵시적 형변환 이일어난다.
        long l = i;
        // 큰 그릇에 있는 값을 작은 그릇에 옮겨 담으려고 할때..  명시적으로 형변환 한다.
        //컴파일러는 그릇안에 들어있는 값은 안본다.  단지 그릇의 크기만 비교한다.
        i =(int)l;

        byte b = 10;

        i = i;

        b = (byte)i;

        float f = 10.7f;

        l = (long)f;  //why?  실수를 저장..  10.3;  소숫점 이하의 값을 가질 수 있다.

        System.out.println(l);

        boolean boo = true;
        //형변환이 가능 하다는 것은 데이터타입이 같다는것..   실수, 정수 모두 숫자
//        l = (long)boo;

        char c = 'a';
        i = c;

        System.out.println(i++);
        System.out.println((char)i);
    }
}
