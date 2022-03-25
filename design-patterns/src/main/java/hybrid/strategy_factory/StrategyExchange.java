package hybrid.strategy_factory;

import hybrid.strategy_factory.strategy.*;

public enum StrategyExchange {
    /**
     * 枚举策略类
     */
    BACK("BACK", BackStrategy.class),
    CUT("CUT", CutStrategy.class),
    FULL("FULL",FullStrategy.class),
    EMPTY("EMPTY",EmptyStrategy.class);

    private String action;
    private Class<?> strategy;

    private StrategyExchange(String action, Class<?> strategy) {
        this.action = action;
        this.strategy = strategy;
    }

    public static StrategyExchange getValue(String action) {
        StrategyExchange[] values = StrategyExchange.values();
        for (StrategyExchange val : values) {
            if (val.action.equals(action)) {
                return val;
            }
        }
        return EMPTY;
    }

    public Class<?> getStrategy() {
        return strategy;
    }

    public String getAction() {
        return action;
    }
}
