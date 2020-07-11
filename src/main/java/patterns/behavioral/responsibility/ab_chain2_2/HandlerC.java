package patterns.behavioral.responsibility.ab_chain2_2;

public class HandlerC extends Handler {
    @Override
    protected void doHandle() {
        //业务代码
        System.out.println("Handler C --- > handled");
    }
}
