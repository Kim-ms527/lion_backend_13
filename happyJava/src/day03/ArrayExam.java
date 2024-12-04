package day03;

public class ArrayExam {
    public static void main(String args[]) {
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        int score4 = 0;

        int sum = score1+score2+score3+score4;

        String[] str;
        //배열
        //배열을 선언 , 사용
        //변수선언..  타입 변수명
        //타입[] 배열명 ;   -- 배열의 선언
        int[] iarr;
        //배열 생성
        iarr = new int[5];
        //배열을 사용
        iarr[0] = 10;
        iarr[1] = 20;
        iarr[3] = 30;
        iarr[4] = 40;
//        iarr[5] = 50;

        System.out.println(iarr[0]);

        int ii = iarr[4];

        System.out.println(ii);


        int iarr2[] = new int[3];

        // 로또
        int[] lotto = new int[55];

//        lotto[0] = 1;
//        lotto[1] = 2;
//        lotto[2] = 3;
//        lotto[3] = 4;
        for(int i = 0; i < lotto.length; i++){
            lotto[i] = i+1;
        }

        System.out.println(lotto[40]);

        int sum2 = 0;

        for(int i = 0; i < lotto.length; i++){
            sum2 = sum2+lotto[i];  //누적
        }
        System.out.println("lotto합::"+sum2);

        System.out.println("lotto평균"+(sum2/ lotto.length));

//        String[] str;

        str = new String[3];
        str[0] = "hello";
        str[1] = "hi";
        str[2] = "hoho";

        int[] iarr5 = {4,2,67,3};  //생성과 동시에 초기화.  (처음 생성시만 가능!!)

//        str = {"a","b","c"};

        String[]  sarry = {"a","b","c"};

        for (int i = 0; i < sarry.length; i++){
            System.out.println(sarry[i]);
        }


        int[] arry7 = new int[5];
        for (int i = 0; i < arry7.length; i++){
            System.out.println(arry7[i]);
        }



        int[] iarr8 = new int[]{1,2,3};  //int[] iarr8={1,2,3}

        int[][] iarr9 = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] iarr10 = {{1,2},{6,7,78,89,6,56,4,4}};
    }
}
