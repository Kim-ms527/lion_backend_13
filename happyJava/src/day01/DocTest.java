package day01;

/**
 * 자바 주석 테스트 하는 클래스
 *
 * @author carami
 * @since 2024.12.02
 */
public class DocTest {
    public static void main(String[] args) {
        //아무거나 테스트 해보아요^^
        System.out.println("주석문 안에 들어있는 것들은 실행되지는 않아요.");

        /*
        *
        * */

        //반복문!!  while
        //while(조건식){ 반복할 문장 }  //조건식의 결과가 참 일때까지 반복할 문장을 실행.   (1+1) - 결과가 참, 거짓.
        //변수 (값을 담을 그릇이 필요하다.)
        int i = 10;    // 타입 변수명 = 초기값
        System.out.println(i);
        while(i>=0) {
            System.out.println("****");
            i = i -1;
        }
    }
}
