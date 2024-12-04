package day03;

public class ArrayExam2 {
    public static void main(String[] args) {
        int[][] iarr=new int[3][];
//        iarr[0][0] = 10;
            iarr[0] = new int[2];
            iarr[0][1] = 10;


        System.out.println(iarr[0][1]);

        iarr[1] = new int[5];
        iarr[2] = new int[3];


        int[][][]  iarr3 = new int[2][3][4];


    }
}
