package day16;

//여러가지 복잡한걸 한번에 싹
class Refrigerator {
    public void pickup(String subject) {
        System.out.println("냉장고에서 " + subject + " 꺼냄");
    }
}

class Induction {
    public void on() {
        System.out.println("지이이이이잉");
    }
    public void use() {
        System.out.println("치이익");
    }

    public void off() {
        System.out.println("피유유유융");
    }
}

class Knife {
    public void wash() {
        System.out.println("촤아아아악");
    }

    public void use() {
        System.out.println("대충 칼 써는 소리");
    }
}

class AutoKookingSystem {
    public Refrigerator refrigerator;
    public Induction induction;
    public Knife knife;

    public AutoKookingSystem() {
        refrigerator = new Refrigerator();
        induction = new Induction();
        knife = new Knife();
    }

    public void start(String subject) {
        refrigerator.pickup(subject);
        knife.wash();
        knife.use();
        knife.wash();
        induction.on();
        induction.use();
        induction.off();
        System.out.println(subject + "(으)로 요리 완성했음");
        System.out.println("내가 요리 만들었으니 설거지는 네가 하셈");
    }
}


public class facadeEx2 {
    public static void main(String[] args) {
        AutoKookingSystem auto = new AutoKookingSystem();
        auto.start("닭");
    }
}