package thread.trans.lock.demo3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dingyubin
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        lock.lock();
        try {
            System.out.println(" await时间为" + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println(" await方法 解锁完毕");
        }
    }

    public void signal(){
        lock.lock();
        try {
            System.out.println(" signal时间为" + System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
            System.out.println(" signal方法 解锁完毕");
        }
    }
}
