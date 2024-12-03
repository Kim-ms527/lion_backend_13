package day02;

public class WhileExam2 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        //형변환
        int count = Integer.parseInt(args[0]);
       int num = 0;
        while (true){
            System.out.println(++num);

            if(num == count){
                break;
            }
        }
    }
}
// java WhileExam2 20 ac dd dkfjd  dkfjd