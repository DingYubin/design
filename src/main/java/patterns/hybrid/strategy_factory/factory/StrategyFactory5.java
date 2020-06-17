package patterns.hybrid.strategy_factory.factory;

import patterns.hybrid.strategy_factory.strategy.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 动态加载，非缓存
 */
public class StrategyFactory5 {
    private static final Map<String, Strategy> STRATEGY_MAP = new HashMap<String, Strategy>();

    /**
     * @param c 反射拿到对应的策略类
     * @param <T>
     * @return
     */
    public static <T extends Strategy>T getStrategy(Class<T> c){
      Strategy strategy = null;
      String key = c.getName();
        if (STRATEGY_MAP.containsKey(key)){
            strategy = STRATEGY_MAP.get(key);
        }else {
            try {
                strategy = (Strategy) Class.forName(c.getName()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //把对象缓存在map中
            STRATEGY_MAP.put(key, strategy);
        }

        return (T) strategy;
    }
}
