package day04;

public class Exam2 {
    public static void main(String[] args) {
        //java Exam2 10 hi kang 111

        System.out.println(args.length);

        if(args.length == 0){
            System.out.println("사용법 ::  "  );
            System.exit(0);
        }

        for (String str:args){
            System.out.println(str);
        }
    }
}
