package patterns.behavioral.strategy;

/**
 * 定义一组算法，将每一组算法都封装起来，并且他们之间都可以互换
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy1());
        context.doAnything();
    }
}
