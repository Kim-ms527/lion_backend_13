package day07;

public class StringTest4 {
    public static void main(String[] args) {
        String str = new String("hello"); // 다른 객체들이 생성되는 일반적인 방법..
        String str2 = "hello";  // String은 너무 많이 사용이 되므로 자바가 설계시 이렇게 쓸 수 있도록 설계했다.
        String str3 = "hello";

        System.out.println(str2 = str2.toUpperCase());

        System.out.println(str2);


        String greeting = "Hello, World!";
        String name = "kang";

        // 부분 문자열 추출 (substring 메서드)
        String substring = greeting.substring(7, 12); // "World" 추출
        System.out.println("substring: " + substring);

        // 문자열 비교 (equals 메서드)
        boolean isSame = greeting.equals("Hello, World!");
        System.out.println("greeting과 \"Hello, World!\"는 동일한가? " + isSame);

        // 대소문자 변환 (toUpperCase / toLowerCase)
        String upper = greeting.toUpperCase();
        String lower = greeting.toLowerCase();
        System.out.println("대문자 변환: " + upper);
        System.out.println("소문자 변환: " + lower);

        // 문자열 연결 (concat 메서드 또는 + 연산자)
        String combined = greeting + " " + name;
        System.out.println("문자열 연결: " + combined);

        // 공백 제거 (trim 메서드)
        String spacedString = "   Hello!   ";
        System.out.println("공백 제거 전 길이: " + spacedString.length());
        String trimmed = spacedString.trim();
        System.out.println("공백 제거 후 길이: " + trimmed.length());
        System.out.println("trimmed: \"" + trimmed + "\"");
    }
}
