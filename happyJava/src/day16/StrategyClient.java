package day16;

// Strategy 인터페이스
 interface Strategy {
    void execute();
}

// 구체 전략 A
 class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("전략 A 실행");
    }
}

// 구체 전략 B
 class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("전략 B 실행");
    }
}

// Context
 class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void performAction() {
        strategy.execute();
    }
}

// 클라이언트 사용 예
public class StrategyClient {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.performAction(); // 전략 A 실행

        context.setStrategy(new ConcreteStrategyB());
        context.performAction(); // 전략 B 실행

        //ConcreteStrategyC 전략을 이용해서 동작하도록 구현을 추가해보세요.

    }
}