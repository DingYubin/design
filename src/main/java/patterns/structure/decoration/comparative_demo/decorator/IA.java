package patterns.structure.decoration.comparative_demo.decorator;

//装饰器模式的代码结构(下面的接口也可以替换成抽象类)
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
        // 功能增强代码
            a.f();
        // 功能增强代码
    }
}
