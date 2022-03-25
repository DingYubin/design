package patterns.behavioral.template;

public class ConcreteClass2 extends AbstractClass{
    @Override
    protected void doSomething() {
        System.out.println("业务2做一些事");
    }

    @Override
    protected void doAnything() {
        System.out.println("业务2做任何事");
    }
}
