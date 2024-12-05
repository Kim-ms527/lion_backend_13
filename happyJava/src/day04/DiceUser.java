package day04;

public class DiceUser {
    public static void main(String[] args) {
        Dice dice = new Dice();  //모든 객체는 인스턴스화될때 생성자가 실행된다.
        dice.face = 45;

        dice.roll();

        System.out.println(dice.eye);
    }
}
