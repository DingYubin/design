package patterns.behavioral.responsibility.ab_chain;

public class ConcreteHandler3 extends Handler{
    protected Level getHandlerLevel() {
        //完成处理逻辑
        return Level.SON_LEVEL_REQUEST;
    }

    protected Response echo(Request request) {
        //设置自己的处理级别
        return null;
    }
}
