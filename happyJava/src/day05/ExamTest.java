package day05;

public class ExamTest {
    public static void test(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        Exam e = new Exam();

        int i = 10;
        int j = i;

        i += 10;

        System.out.println(j);

        int[] iarr = {10};

        int[] jarr = iarr;

        iarr[0] += 10;

        System.out.println(jarr[0]);

        test(10);
    }
}
