package thread.trans.lock.produce;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set(){
        lock.lock();
        try {
            //有值就等等
            if (hasValue == true) {
                condition.await();
            }

            System.out.println("打印★");
            hasValue = true;
            condition.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void get(){
        lock.lock();
        try{
            //无值就等等
            if (hasValue == false){
                condition.await();
            }
            System.out.println("打印☆");
            hasValue = false;
            condition.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
