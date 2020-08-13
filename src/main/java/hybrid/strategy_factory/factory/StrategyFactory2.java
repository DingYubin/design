package hybrid.strategy_factory.factory;

import hybrid.strategy_factory.strategy.*;

/**
 * 动态加载，非缓存
 */
public class StrategyFactory2 {

    public static Strategy getStrategy(String key){
        if (key == null) {
            return new EmptyStrategy();
        }

        if (key.equals(Key.CUT)){
            return new CutStrategy();
        }else if (key.equals(Key.CASH_BACK)){
            return new BackStrategy();
        }else if (key.equals(Key.FULL_REDUCTION)){
            return new FullStrategy();
        }

        return new EmptyStrategy();
    }



    private interface Key{
        String CUT = "CUT";
        String CASH_BACK = "CASH_BACK";
        String FULL_REDUCTION = "FULL_REDUCTION";
    }
}
