package patterns.behavioral.mediator.demo;

//抽象同事类
public abstract class AbstractCollleague {
    protected AbstractMediator mediator;

    public AbstractCollleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
