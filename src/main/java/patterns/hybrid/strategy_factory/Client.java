package patterns.hybrid.strategy_factory;

import patterns.hybrid.strategy_factory.factory.StrategyFactory;

public class Client {
    public static void main(String[] args) {
        String key = "CUT";
        Context context = new Context(StrategyFactory.getStrategy(key));
        context.executeStrategy();
    }
}
