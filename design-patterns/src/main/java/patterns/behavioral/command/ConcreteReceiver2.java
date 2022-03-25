package patterns.behavioral.command;

public class ConcreteReceiver2 extends Receiver{
    @Override
    public void doSomething() {
        System.out.println("处理业务2");
    }
}
