package patterns.structure.decoration.comparative_demo.proxy;

//代理模式的代码结构(下面的接口也可以替换成抽象类)
public interface IA {
    void f();
}

class A implements IA {
    @Override
    public void f() {

    }
}

class AProxy implements IA {
    private IA a;
    public AProxy(IA a) {
        this.a = a;
    }

    @Override
    public void f() {
    // 新添加的代理逻辑
    a.f();
    // 新添加的代理逻辑
    }
}
