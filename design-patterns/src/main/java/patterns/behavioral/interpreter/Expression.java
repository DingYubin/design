package patterns.behavioral.interpreter;

public abstract class Expression {
    public abstract Object interpreter(Context ctx);
}
