package day05;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p.name = "kang";

        p2.name="kim";
        p3.name ="hong";

        System.out.println(p.name);
        System.out.println(p2.name);
        System.out.println(p3.name);

        p.count = 10;
        p2.count = 20;
        p3.count = 30;

        System.out.println(p.count);
        System.out.println(p2.count);
        System.out.println(p3.count);

        System.out.println(Person.count);

    }

}
