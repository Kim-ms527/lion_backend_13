package day03;

import java.util.Arrays;

public class ArrayExam7 {
    public static void main(String[] args) {
        int[] copyFrom = {1,2,3,66,33,767,88,33};

        int [] copyTo = new int[copyFrom.length];

        for(int i = 0; i < copyFrom.length; i++){
            copyTo[i] = copyFrom[i];
        }

//        int[] copyTo = Arrays.copyOf(copyFrom,copyFrom.length);

        for (int num : copyTo){
            System.out.println(num);
        }
        System.out.println("----------------------------------");
        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5);
        for(int c : copyTo2){
            System.out.println(c);
        }


    }
}
