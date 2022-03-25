package patterns.behavioral.observer.demo2;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZi implements Observable,IHanFeiZi {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver(String context) {
        for (Observer observer:observers){
            observer.update(context);
        }
    }

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        this.notifyObserver("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        this.notifyObserver("韩非子在娱乐");
    }
}
