package day07;

public class StringTest2 {
    public static void main(String[] args) {

        //그래서 String 불변 클래스!!!

        MyClass myClass = new MyClass();
        MyClass myClass1 =  myClass;
        MyClass myClass2 = myClass;

        myClass.i = 10;


        myClass1.i = 20;

        myClass2.i = 30;


        System.out.println(myClass.i);

// String이 아래와 같이 생성되면 Hello 라는 문자열은 하나만 만들어지고
        //모두 같은 문자열을 가리키고 있으므로...
        //하나를 바꾸면 모두 바뀌게될텐데...   그러면 안될거니까...
        //String 은 한 번 생성되면 스스로 바뀌지 않는 불변 클래스로 만들어짐.
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello";

        System.out.println(str1.concat(" world!!"));


        System.out.println(str1);


        System.out.println(myClass.concat(10));
        System.out.println(myClass.i);


        str1 = str1.concat(" world");

//String이 불변 클래스일 수 밖에 없는 이유를 이해하시면됩니다.




    }
}
