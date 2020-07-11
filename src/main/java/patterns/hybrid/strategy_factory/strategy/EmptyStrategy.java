package patterns.hybrid.strategy_factory.strategy;

public class EmptyStrategy implements Strategy{

    public void doSometing() {
        System.out.println("现在没有活动。。。");
    }
}
