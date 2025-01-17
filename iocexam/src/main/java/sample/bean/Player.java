package sample.bean;

public class Player {
    private String name;
    private Dice dice; //실행될때 주사위를 주입받아야 함.  (의존성 주입  DI)

//DI 컨테이너를 통해 주입받는 방법.
    //1.생성자를 통한 주입   --  생성자가필요.. (우리가 만들어놔야함)
    //2. 설정자(setter)를 통한 주입
    //3. 필드를 통한 주입

    public Player(){

    }

//    public Player(Dice dice) {
//        this.dice = dice;
//    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play(){
        System.out.println(name + "은 주사위를 던져서 "+dice.getNumber()+"가 나왔습니다.");
    }
}
