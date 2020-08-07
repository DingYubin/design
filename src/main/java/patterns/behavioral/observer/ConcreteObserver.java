package patterns.behavioral.observer;

public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("接受消息，并且处理！");
    }
}
