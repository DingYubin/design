package patterns.behavioral.observer;

import java.util.Vector;

public abstract class Subject {
    protected Vector<Observer> observers = new Vector<Observer> ();

    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public void delObserver(Observer o) {
        this.observers.remove(o);
    }

    public void notifyObserver(){
        for (Observer observer : observers){
            observer.update();
        }
    }
}
