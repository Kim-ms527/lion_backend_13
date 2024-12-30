package day15;

//하나만 생성되어야 하는 객체.
class Singleton{
    //1. 클래스 내부에 자신의 유일한 인스턴스를 저장
    private static Singleton singleton  = new Singleton();;

    //2. 외부에서는 생성할 수 없도록..  private한 생성자를 선언함.
    private  Singleton(){
        System.out.println("Singleton 생성");
    }

    //3. 자기 자신을 리턴하는 static한 메소드를 정의
    public  static Singleton getInstance(){

//        if(singleton == null){
//            //한 번도 생성되지 않았으므로 객체생성
//            singleton = new Singleton();
//        }
        return singleton;
    }

}


public class SingleTonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();


       Singleton singleton2 = Singleton.getInstance();

       if(singleton == singleton2){
           System.out.println("같은객체입니다.");
       }else{
           System.out.println("다른 객체입니다.");
       }

    }
}
