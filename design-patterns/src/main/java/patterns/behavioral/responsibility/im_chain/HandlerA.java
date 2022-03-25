package patterns.behavioral.responsibility.im_chain;

public class HandlerA implements IHandler {

    @Override
    public boolean handle() {
        boolean handled = false;//继续传递
        //业务代码
        System.out.println("Handler A --- > handled");
        return handled;
    }
}
