package day16;


// Strategy 인터페이스: 문자열을 변환하는 알고리즘을 정의합니다.
interface TextStrategy {
    String formatText(String input);
}

// ConcreteStrategy A: 문자열을 모두 대문자로 변환하는 전략입니다.
class UpperCaseStrategy implements TextStrategy {
    @Override
    public String formatText(String input) {
        return input.toUpperCase();
    }
}

// ConcreteStrategy B: 문자열을 모두 소문자로 변환하는 전략입니다.
class LowerCaseStrategy implements TextStrategy {
    @Override
    public String formatText(String input) {
        return input.toLowerCase();
    }
}

// ConcreteStrategy C: 문자열 양 끝에 별(*) 문자를 붙이는 전략입니다.
class StarSurroundStrategy implements TextStrategy {
    @Override
    public String formatText(String input) {
        return "*" + input + "*";
    }
}

// Context 클래스: 전략을 주입받아 문자열 포맷팅 작업을 수행합니다.
class TextFormatter {
    private TextStrategy strategy;

    public TextFormatter(TextStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TextStrategy strategy) {
        this.strategy = strategy;
    }

    public String format(String input) {
        return strategy.formatText(input);
    }
}

// 클라이언트 코드: 런타임에 전략을 교체하며 문자열을 포맷팅합니다.
public class StrategySample {
    public static void main(String[] args) {
        // 처음에는 대문자 전략을 사용합니다.
        TextFormatter formatter = new TextFormatter(new UpperCaseStrategy());
        System.out.println(formatter.format("Hello Strategy Pattern"));
        // 결과: "HELLO STRATEGY PATTERN"

        // 런타임에 소문자 전략으로 교체합니다.
        formatter.setStrategy(new LowerCaseStrategy());
        System.out.println(formatter.format("Hello Strategy Pattern"));
        // 결과: "hello strategy pattern"

        // 런타임에 별(*)로 둘러싸는 전략으로 교체합니다.
        formatter.setStrategy(new StarSurroundStrategy());
        System.out.println(formatter.format("Hello Strategy Pattern"));
        // 결과: "*Hello Strategy Pattern*"
    }
}