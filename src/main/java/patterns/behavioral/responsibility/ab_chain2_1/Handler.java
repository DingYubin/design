package patterns.behavioral.responsibility.ab_chain2_1;

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public final void handle(){
        boolean handled = doHandle();
        if (successor != null && !handled){
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}
