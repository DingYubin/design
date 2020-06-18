package patterns.behavioral.responsibility;



import patterns.behavioral.responsibility.demo2.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * 责任链模式：使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止
 */
public class Client2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
        for (int i = 0; i < 5; i++){
            arrayList.add(new Women(random.nextInt(4),"我要出去逛街"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women:arrayList){
            father.handleMessage(women);
        }
    }
}
