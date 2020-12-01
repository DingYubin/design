package thread.trans.lock.demo4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dingyubin
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void awaitA(){
        lock.lock();
        try {
            System.out.println("begin awaitA时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            condition.await();
            System.out.println(" end awaitA时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println(" awaitA方法 解锁完毕");
        }
    }

    public void awaitB(){
        lock.lock();
        try {
            System.out.println("begin awaitB时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            condition.await();
            System.out.println(" end awaitB时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println(" awaitB方法 解锁完毕");
        }
    }

    public void signalAll(){
        lock.lock();
        try {
            System.out.println("  signalAll时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            condition.signalAll();
        } finally {
            lock.unlock();
            System.out.println("  signalAll方法 解锁完毕");
        }
    }
}
