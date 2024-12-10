package day07;

public class StringTest3 {
    public void test(){


        System.out.println("1");
        if(true){
            return;
        }
        System.out.println("2");
    }

    public static boolean findChar(String s, char c) {
        //greeting 안에 특정한 문자 찾기 -> "a"
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i)) == 'c') {
                return true;
            }
        }

        return false;
    }

//    static boolean find(String data, char findChar) {
//        boolean isAt = false;
//        for (int i = 0; i < data.length(); i++) {
//            if (data.charAt(i) == findChar) {
//                isAt = true;
//                  break;
//            }
//        }
//        return isAt;
//    }
    public static void main(String[] args) {
        String greeting = "Hello World1";

        System.out.println(greeting.length());

        char firstChar = greeting.charAt(0);
        System.out.println(firstChar);

        //문자열 안에 특정한 문자를 찾을 수 있을까? -- 이 기능을 가진 메소드를 정의해 보세요.
        //boolean    find(String data, char findChar){}
        // data 안에 findChar이 존재하면 true,없으면 false를 리턴하는 메소드를 정의해보세요.



        MyClass myClass = new MyClass();
        myClass.i = 10;
        MyClass myClass1 = new MyClass();
        myClass1.i = 20;


        myClass = new MyClass();



        //greeting 안에 특정한 문자 찾기 -> "a"
        String flag = "false";
        for(int i = 0; i < greeting.length(); i++){
            if((greeting.charAt(i)) == 'a'){
                flag = "true";
                break;
            }
        }
        System.out.println(flag);


    }
}
