package day06;
class Bird{
    //많은 필드와 메소드가 있다고 가정하자..

    public void song(){
        System.out.println("새가 노래하다 ");
    }
}
class 비둘기 extends Bird{
    @Override
    public void song() {
        System.out.println("구구구구");
    }
}
class 오리 extends Bird{
    @Override
    public void song() {
        System.out.println("꽥꽥");
    }
}
class 참새 extends Bird{
    @Override
    public void song() {
        System.out.println("짹짹");
    }
}
public class BirdExam {
    public static void main(String[] args) {
        Bird 새 = null;
        if(args[0].equals("비둘기")){
            새 = new 비둘기();
        } else if (args[0].equals("오리")) {
            새 = new 오리();

        } else if (args[0].equals("참새")) {
            새 = new 참새();
        }else {
            새 = new Bird();
        }

        새.song();
    }
}
