package day16;

//홈시어터
//
class Projector{
    public void on(){
        System.out.println("프로젝터를 켭니다");
    }

    public void setInput(String source){
        System.out.println("프로젝터 입력을 "+ source + "로 설정합니다.");
    }
}
class 전동커튼{
    public void on(){
        System.out.println("전동커튼이 열립니다.");
    }
    public void off(){
        System.out.println("커튼을 닫습니다.");
    }
}
class Amplifier{
    public  void on(){
        System.out.println("앰프를 켭니다. ");
    }
    public void setVolume(int level){
        System.out.println("볼륨을 "+ level + "로 설정합니다. ");
    }
}

class MoviePlayer{
    public void on(){
        System.out.println("MoviePlayer를 켭니다.");
    }
    public void play(String movie){
        System.out.println("영화 "+ movie + " 를 재생합니다. ");
    }
}

class HomeTheaterFacade{
    private 전동커튼 electricCurtain;
    private MoviePlayer moviePlayer;
    private  Amplifier amplifier;
    private Projector projector;

    public HomeTheaterFacade(전동커튼 electricCurtain, MoviePlayer moviePlayer, Amplifier amplifier, Projector projector){
        this.electricCurtain = electricCurtain;
        this.moviePlayer = moviePlayer;
        this.amplifier = amplifier;
        this.projector = projector;
    }

    public void watchMovie(String movie){
        System.out.println("영화를 보기위한 준비를 시작합니다.");
        electricCurtain.off();
        projector.on();
        projector.setInput("넷플릭스");
        amplifier.on();
        amplifier.setVolume(5);
        moviePlayer.on();
        moviePlayer.play(movie);
        System.out.println("준비가 끝났어요.  즐거운 시간^^");
    }
    public void endMovie(){
        System.out.println("영화가 종료되었습니다. ");
        System.out.println("장비를 모두 끕니다. ");
        //여러분이 구현해주세요^^

    }
}

public class FacadeDemo {
    public static void main(String[] args) {
        //우리집의 가전들을 직접 다 사용한다라고 생각해봅시다.
        //커튼을 닫고, 프로젝트를 켜고, 엠프도 켜고 MoviePlayer도 켜서..   볼륨도 조절하고
        //영화를 볼거다라고 하면...   코드를 어떻게 만들어줄까요?
        전동커튼 electricCurtain = new 전동커튼();
        MoviePlayer moviePlayer = new MoviePlayer();
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();

//        //영화를 보기 위해서 어떤일을 할지...
//        electricCurtain.off();
//        projector.on();
//        projector.setInput("넷플릭스");
//        amplifier.on();
//        amplifier.setVolume(5);
//        moviePlayer.on();
//        moviePlayer.play("해리포터");
//

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(electricCurtain,moviePlayer,amplifier,projector);

        homeTheater.watchMovie("해리포터");


        //영화가 끝나고 나면...  어떤 작업들을 할까?  요런 부분들을 생각해보세요.
        homeTheater.endMovie();
    }
}
