package patterns.behavioral.observer;

public class ConcreteSubject extends Subject{
    public void doSomething(){
        /**
         * do something
         */
        super.notifyObserver();
    }
}
