package patterns.behavioral.state.demo1;

/**
 * 关门状态
 */
public class ClosingState extends LiftState{
    //电梯门关了，可以再打开
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);//设置开门状态
        super.context.getLiftState().open();
    }
    //电梯门关闭，这是关闭状态要实现的动作
    @Override
    public void close() {
        //状态修改
        System.out.println("电梯关门...");
    }
    //电梯门关类就运行，这是再正常不过了
    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);//设置为运行状态
        super.context.getLiftState().run();
    }
    //电梯门关了，我就不按楼层
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);//设置停止状态
        super.context.getLiftState().stop();
    }
}
