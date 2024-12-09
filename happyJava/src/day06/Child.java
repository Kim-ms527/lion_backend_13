package day06;

class Child extends Parent {
    Child(){
        System.out.println("Child 생성자 실행!!");
    }
    int i = 10;   //i가 오버라이딩 된 상태.

    public int getI(){
        return i;
    }

    public void print(){
        System.out.println(i);
    }
}
