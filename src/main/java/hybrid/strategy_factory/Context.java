package hybrid.strategy_factory;

import hybrid.strategy_factory.strategy.Strategy;

public class Context {
    //抽象策略
    private Strategy strategy;
    //构造函数
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.doSometing();
    }
}
