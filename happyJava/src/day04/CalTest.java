package day04;

public class CalTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int sum = cal.add(3,4);
        System.out.println(sum);

        cal.plus(3,5);
        System.out.println(cal.result);
    }
}
