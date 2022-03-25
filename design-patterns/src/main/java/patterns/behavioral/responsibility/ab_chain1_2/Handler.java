package patterns.behavioral.responsibility.ab_chain1_2;

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handle();
}
