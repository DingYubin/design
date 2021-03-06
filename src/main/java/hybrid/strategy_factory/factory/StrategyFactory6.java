package hybrid.strategy_factory.factory;

import hybrid.strategy_factory.StrategyTypeMapper;
import hybrid.strategy_factory.strategy.Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 动态加载，非缓存
 */
public class StrategyFactory6 {
    private static final Map<String, Strategy> STRATEGY_MAP = new HashMap<String, Strategy>();

    /**
     * action 传入的类型参数
     * key 传入的 反射参数 (注解方式)
     * strategy : 策略对象
     * @return
     */
    public static <T extends Strategy>T getStrategy(String action){
      Strategy strategy = null;
        String key = StrategyTypeMapper.getValue(action).getName();
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
