package patterns.behavioral.interpreter.demo;

import java.util.HashMap;

public abstract class SymbolExpression extends Expression{
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
