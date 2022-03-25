package patterns.behavioral.state.demo1;

/**
 * 运行状态
 */
public class RunningState extends LiftState{
    //运行时候，什么都不做
    @Override
    public void open() {
        //do nothing
    }
    //运行时候，什么都不做
    @Override
    public void close() {
        //do nothing
    }
    //这是在运行状态下要实现的方法
    @Override
    public void run() {
        System.out.println("电梯上下运动中...");
    }
    //状态改变
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
