package patterns.behavioral.state;

public class ConcreteState2 extends State{

    @Override
    public void handle1() {
        //设置当前状态为state1
        super.context.setCurrentState(Context.STATE1);
        //过度到state1状态，有Context实现
        super.context.handle1();
    }

    @Override
    public void handle2() {
        //本状态下必须处理的逻辑
        System.out.println("执行2状态");
    }
}
