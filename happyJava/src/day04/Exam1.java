package day04;

public class Exam1 {
    public static void main(String[] args) {

        int i = 10;



        int j = i;  //i 의 값을 j 에 넣어주세요.   i 의 값이 복사되서 j 에 들어갑니다.

        i += 10;

        System.out.println("i::"+i);
        System.out.println("j::"+j);

        int[] iarr = {10};

        int[] iarr2 = iarr;

        iarr[0] += 10;

        System.out.println("iarr::"+iarr[0]);
        System.out.println("iarr2::"+iarr2[0]);





    }
}
