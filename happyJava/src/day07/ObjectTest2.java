package day07;

import java.util.Objects;

class Person{
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;//객체가 같은지 비교
//        if (o == null || getClass() != o.getClass()) return false;
//        //클래스가 같은지 비교
//        MyClass myClass = (MyClass) o;
//        return i == myClass.i;
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class ObjectTest2 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.i = 10;
        System.out.println(myClass);

//        myClass.

        Person kang = new Person("강경미",20, "서울시 마포구");

        System.out.println(kang);
    }
}
