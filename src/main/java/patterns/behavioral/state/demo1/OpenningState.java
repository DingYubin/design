package patterns.behavioral.state.demo1;

/**
 * 开门状态
 */
public class OpenningState extends LiftState{

    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }
    //开门当然可以关闭了，我就想测试一下电梯门关闭功能
    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.closingState);
        //动作委托为CloseState来执行
        super.context.getLiftState().close();
    }
    //开门时电梯就运行，这电梯，吓死人
    @Override
    public void run() {
        //do nothing;
    }
    //开门还不停止？
    @Override
    public void stop() {
        //do nothing;
    }
}
