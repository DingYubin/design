package patterns.hybrid.strategy_factory;

import patterns.hybrid.strategy_factory.factory.StrategyFactory4;
import patterns.hybrid.strategy_factory.factory.StrategyFactory5;
import patterns.hybrid.strategy_factory.strategy.CutStrategy;

public class Client {
    public static void main(String[] args) {
//        String key = "CUT";
//        Context context = new Context(StrategyFactory.getStrategy(null));
//        context.executeStrategy();

//        String key = "CUT";
//        Context context = new Context(StrategyFactory2.getStrategy(null));
//        context.executeStrategy();

//        Context context = new Context(StrategyFactory4.getStrategy(CutStrategy.class));
//        context.executeStrategy();

        String action = "FULL";
        Context context = new Context(StrategyFactory5.getStrategy(action));
        context.executeStrategy();
    }
}
