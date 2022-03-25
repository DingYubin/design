package patterns.behavioral.responsibility.ab_chain1_1;

public class HandlerA extends Handler{
    public void handle() {
        boolean handled = false;
        //业务代码
        System.out.println("Handler A --- > handled");
        if (!handled && successor != null){
            successor.handle();
        }
    }
}
