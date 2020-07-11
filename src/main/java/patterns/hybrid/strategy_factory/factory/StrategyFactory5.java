package patterns.hybrid.strategy_factory.factory;

import patterns.hybrid.strategy_factory.StrategyExchange;
import patterns.hybrid.strategy_factory.strategy.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 动态加载，非缓存
 */
public class StrategyFactory5 {
    private static final Map<String, Strategy> STRATEGY_MAP = new HashMap<String, Strategy>();

    /**
     * action 传入的类型参数
     * key 传入的 反射参数
     * strategy : 策略对象
     * @return
     */
    public static <T extends Strategy>T getStrategy(String action){
      Strategy strategy = null;
      String key = StrategyExchange.getValue(action).getStrategy().getName();
        if (STRATEGY_MAP.containsKey(key)){
            strategy = STRATEGY_MAP.get(key);
        }else {
            try {
                strategy = (Strategy) Class.forName(key).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //把对象缓存在map中
            STRATEGY_MAP.put(key, strategy);
        }

        return (T) strategy;
    }
}
