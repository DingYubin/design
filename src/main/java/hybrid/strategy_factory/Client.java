package hybrid.strategy_factory;

import hybrid.strategy_factory.factory.StrategyFactory5;

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

//        String action = StrategyExchange.BACK.getAction();
//        Context context = new Context(StrategyFactory5.getStrategy(action));
//        context.executeStrategy();

        String action = "CUT";
        Context context = new Context(StrategyFactory5.getStrategy(action));
        context.executeStrategy();
    }
}
