package patterns.behavioral.responsibility.ab_chain2_1;

/**
 * 链表问题
 */
public class HandlerChain {
    private Handler head = null;//头指针
    private Handler tail = null;//尾指针

    public void addHandler(Handler handler){
        handler.setSuccessor(null);// A -> null

        if (head == null){
            head = handler;
            tail = handler;
            return;
        }

        tail.setSuccessor(handler);//A -> B -> C -> null
        tail = handler;
    }

    public void handle(){
        if (head != null){
            head.handle();
        }
    }
}
