package patterns.behavioral.responsibility.ab_chain2_1;

public class HandlerB extends Handler {
    @Override
    protected boolean doHandle() {
        boolean handled = false;//继续传递
        //业务代码
        System.out.println("Handler B --- > handled");
        return handled;
    }
}
