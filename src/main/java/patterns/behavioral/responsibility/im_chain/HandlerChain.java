package patterns.behavioral.responsibility.im_chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 链表问题
 */
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<IHandler>();

    public void addHandler(IHandler handler){
        this.handlers.add(handler);
    }

    public void handle(){
        for (IHandler handler : handlers){
            boolean handled = handler.handle();
            if (handled){
                break;
            }
        }
    }
}
