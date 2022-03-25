package patterns.structure.proxy.dynamic_proxy;

public class RealSubject implements Subject{

    @Override
    public void doSomething(String str) {
        System.out.println("do something!--->"+str);
    }
}
