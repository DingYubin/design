package patterns.behavioral.responsibility.ab_chain2_1;

public class HandlerA extends Handler {

    @Override
    protected boolean doHandle() {
        boolean handled = false;//继续传递
        //业务代码
        System.out.println("Handler A --- > handled");
        return handled;
    }
}
