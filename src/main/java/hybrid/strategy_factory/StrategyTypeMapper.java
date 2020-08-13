package hybrid.strategy_factory;

import hybrid.strategy_factory.strategy.BackStrategy;
import hybrid.strategy_factory.strategy.CutStrategy;
import hybrid.strategy_factory.strategy.EmptyStrategy;
import hybrid.strategy_factory.strategy.FullStrategy;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class StrategyTypeMapper {

    @StringDef({
            Action.BACK,
            Action.CUT,
            Action.FULL,
            Action.EMPTY
    })

    @Retention(RetentionPolicy.SOURCE)
    @interface Action {
        String BACK = "BACK";
        String CUT = "CUT";
        String FULL = "FULL";
        String EMPTY = "EMPTY";
    }

    @Action
    private String action;

    @Action
    public String getAction() {
        return action;
    }

    public void setAction(@Action String action) {
        this.action = action;
    }

    public static Class<?> getValue(@Action String action){

        if (Action.BACK.equals(action)) {
            return BackStrategy.class;
        }else if (Action.CUT.equals(action)){
            return CutStrategy.class;
        }else if (Action.FULL.equals(action)){
            return FullStrategy.class;
        }
        return EmptyStrategy.class;
    }

}
