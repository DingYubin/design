package patterns.behavioral.command;

public class ConcreteReceiver1 extends Receiver{
    @Override
    public void doSomething() {
        System.out.println("处理业务1");
    }
}
