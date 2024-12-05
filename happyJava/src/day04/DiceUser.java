package day04;

public class DiceUser {
    public static void main(String[] args) {
        Dice dice = new Dice();
        dice.face = 45;

        dice.roll();

        System.out.println(dice.eye);
    }
}
