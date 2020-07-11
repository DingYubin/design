package patterns.behavioral.responsibility.ab_chain2_2;

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public final void handle(){
        doHandle();
        if (successor != null){
            successor.handle();
        }
    }

    protected abstract void doHandle();
}
