package patterns.behavioral.responsibility.ab_chain1_2;

public class HandlerB extends Handler {
    public void handle() {
        //业务代码
        System.out.println("Handler B --- > handled");
        if (successor != null){
            successor.handle();
        }
    }
}
