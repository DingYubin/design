package patterns.behavioral.responsibility;

import patterns.behavioral.responsibility.ab_chain.*;

/**
 * 责任链模式：使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止
 */
public class ChainClient {
    public static void main(String[] args) {
        //声明所有处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        //设置链种的阶段顺序1-->2-->3
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        //递交请求，返回结果
        Response response = handler1.handleMessage(new Request());
    }
}
