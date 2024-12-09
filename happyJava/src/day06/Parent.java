package day06;

//상속에서 생각해볼 부분!!
//부모가 가진것을 자식이 똑같이 다시 정의 할 수 있어요!!  오버라이딩 이라고 한다.
class Parent {
    Parent(){
        System.out.println("Parent 생성자 실행");
    }
    int i = 5;

    public int getI() {
        return i;
    }
}
