package thread.trans.lock.demo1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dingyubin
 */
public class MyService {

    private Lock lock = new ReentrantLock();

    public void methodA() {
        lock.lock();
        try {
            System.out.println("methodA begin ThreadName="
                                + Thread.currentThread().getName() +
                                " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA end ThreadName="
                                + Thread.currentThread().getName() +
                                "time=" + System.currentTimeMillis());
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void methodB() {
        lock.lock();
        try {
            System.out.println("methodB begin ThreadName="
                    + Thread.currentThread().getName() +
                    " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB end ThreadName="
                    + Thread.currentThread().getName() +
                    "time=" + System.currentTimeMillis());
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
