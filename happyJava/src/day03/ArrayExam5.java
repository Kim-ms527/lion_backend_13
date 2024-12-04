package day03;

public class ArrayExam5 {
    public static void main(String[] args) {
        int[] iarr = {1,2,3,4,5,6,7,8};
        //foreach   for(변수:반복되는 자료구조)
        for(int num :iarr){
            System.out.println(num);
        }

        String[] strArr = {"abe","test","hahah","kang"};

        for(int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }

        for(String str:strArr){
            System.out.println(str);
        }
    }
}
