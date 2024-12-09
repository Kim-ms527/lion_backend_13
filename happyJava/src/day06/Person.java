package day06;

public class Person {
    private String name;
    private int age;
    private String phoneNumber;

    public Person(String name) {
        this.name = name;
        System.out.println(" Person(String name)  생성자실행");
    }

    public Person(String name, int age) {
//        this.name = name;
        this(name);
        this.age = age;
        System.out.println(" Person(String name,int age)  생성자실행");
    }

    public Person(String name, int age, String phoneNumber) {
//        this.name = name;
//        this.age = age;
        this(name,age);
        this.phoneNumber = phoneNumber;
        System.out.println(" Person(String name, int age, String phoneNumber)  생성자실행");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        //Person을 테스트 해봅시다.

        Person park = new Person("park",20,"010-111-111");
    }
}
