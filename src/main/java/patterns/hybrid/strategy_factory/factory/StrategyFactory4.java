package patterns.hybrid.strategy_factory.factory;

import patterns.hybrid.strategy_factory.strategy.*;

/**
 * 动态加载，非缓存
 */
public class StrategyFactory4 {

    public static <T extends Strategy>T getStrategy(Class<T> c){
      Strategy strategy = null;
        try {
            strategy = (Strategy) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) strategy;
    }
}
