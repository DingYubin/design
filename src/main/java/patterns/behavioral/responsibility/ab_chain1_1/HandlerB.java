package patterns.behavioral.responsibility.ab_chain1_1;

public class HandlerB extends Handler{
    public void handle() {
        boolean handled = false;
        //业务代码
        System.out.println("Handler B --- > handled");
        if (!handled && successor != null){
            successor.handle();
        }
    }
}
