package sample.bean;

import java.util.List;

public class Game {
    private List<Player> list;   //플레이어 리스트도 스프링공장을 통해서 생성, 주입 받음.

    public Game(){}
//    public Game(List<Player> list) {
//        System.out.println(" Game(List<Player> list) 생성자 실행");
//        this.list = list;
//    }

    public void setList(List<Player> list) {
        this.list = list;
    }

    public void play(){
        for(Player player : list){
            player.play();
        }
    }
}
