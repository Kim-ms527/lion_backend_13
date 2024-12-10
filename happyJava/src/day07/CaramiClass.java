package day07;

public class CaramiClass {
    private String name;

    public String concat(String word){
        name = name + word;
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        CaramiClass c1 = new CaramiClass();
        c1.setName("kang");

        System.out.println(c1.getName());

        c1.concat(" kyungmi");

        System.out.println(c1.getName());

        String str1 = "kang";

        str1 = str1.concat("kyungmi");

        System.out.println(str1);
    }
}
