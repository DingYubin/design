package thread.trans.lock.demo2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dingyubin
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        lock.lock();
        try {
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("锁被释放了！");
        }
    }
}
