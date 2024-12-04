package day03;

public class ArrayExam6 {
    public static void main(String[] args) {
        int[][] iarr = {{1,2,3},{3,4,5}};

        for(int[] arr :iarr){
            for(int num :arr){
                System.out.println(num);
            }
        }
    }
}
