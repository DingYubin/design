package hybrid.strategy_factory.factory;

import hybrid.strategy_factory.strategy.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂
 */
public class StrategyFactory {

    private static final Map<String, Strategy> STRATEGY_MAP = new HashMap<String, Strategy>();
    private static final Strategy NON_PROMOTION = new EmptyStrategy();

    static {
        STRATEGY_MAP.put(Key.CUT, new CutStrategy());
        STRATEGY_MAP.put(Key.CASH_BACK, new BackStrategy());
        STRATEGY_MAP.put(Key.FULL_REDUCTION, new FullStrategy());
    }

    public static Strategy getStrategy(String key){
        Strategy strategy = STRATEGY_MAP.get(key);
        return strategy == null ? NON_PROMOTION : strategy;
    }

    private interface Key{
        String CUT = "CUT";
        String CASH_BACK = "CASH_BACK";
        String FULL_REDUCTION = "FULL_REDUCTION";
    }
}
