package patterns.structure.proxy.dynamic_proxy;

public class Client1 {
    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义主题的代理
        Subject prox = SubjectDynamicProxy.newProxyInstance(subject);
        //代理的行为
        prox.doSomething("Finish");
    }
}
