package patterns.behavioral.template;

public class ConcreteClass1 extends AbstractClass{
    @Override
    protected void doSomething() {
        System.out.println("业务1做一些事");
    }

    @Override
    protected void doAnything() {
        System.out.println("业务1做任何事");
    }
}
