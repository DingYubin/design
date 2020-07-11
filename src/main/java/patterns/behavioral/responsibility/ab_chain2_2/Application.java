package patterns.behavioral.responsibility.ab_chain2_2;

/**
 * 变体：请求会被所有处理器都处理一边，不存在中途中止情况
 */
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.addHandler(new HandlerC());
        chain.handle();
    }
}
