package patterns.structure.proxy.proxy_pattern;

/**
 * 为其他对象提供一种代理以控制对这个对象的访问
 */
public class Proxy implements Subject{
    //要代理哪个实现类
    private Subject subject = null;
    //默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }
    public Proxy(Subject subject){
        this.subject = subject;
    }
    //通过构造函数传递代理者
    public Proxy(Object...objects){
    }
    //实现接口定义的方法
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before(){
        System.out.println("do something");
    }

    private void after(){
        System.out.println("do something");
    }
}
