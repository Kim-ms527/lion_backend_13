package day10;

public class Exam03 {
    public String test(String msg){
        StringBuilder builder = new StringBuilder(msg);
        builder.append(" world");
        System.out.println(builder);

        builder.delete(6,11);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        return builder.toString();
    }
    public static void main(String[] args) {
        Exam03 exam03 = new Exam03();
        System.out.println(exam03.getClass());


        String str1 = "Java";
        String str2 = "JAVA";
        System.out.println(str1.equals(str2)); // 출력: false
        System.out.println(str1.equalsIgnoreCase(str2)); // 출력: true

        String str = "hello";
        str = str.concat(" world ");
        System.out.println(str);


        StringBuilder builder = new StringBuilder("hello");
        builder.append(" world");
        System.out.println(builder);

        builder.delete(6,11);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        System.out.println("qwr"+122+'a'+builder+"!!");

        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" hi!!");

        System.out.println(buffer);




    }
}
