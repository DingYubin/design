package hybrid.strategy_factory.factory;

import hybrid.strategy_factory.strategy.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂
 */
public class StrategyFactory1 {

    private static final Map<String, Strategy> STRATEGY_MAP = new HashMap<String, Strategy>();

    public static synchronized Strategy getStrategy(String key) throws Exception{

        Strategy strategy = null;
        //如果Map已经有这个对象
        if (STRATEGY_MAP.containsKey(key)){
            strategy = STRATEGY_MAP.get(key);
        }else {
            if (key.equals(Key.CUT)){
                strategy = new CutStrategy();
            }else if (key.equals(Key.CASH_BACK)){
                strategy = new BackStrategy();
            }else if (key.equals(Key.FULL_REDUCTION)){
                strategy = new FullStrategy();
            }else {
                strategy = new EmptyStrategy();
            }
            //把对象缓存在map中
            STRATEGY_MAP.put(key, strategy);
        }
        return strategy;
    }

    private interface Key{
        String CUT = "CUT";
        String CASH_BACK = "CASH_BACK";
        String FULL_REDUCTION = "FULL_REDUCTION";
    }
}
