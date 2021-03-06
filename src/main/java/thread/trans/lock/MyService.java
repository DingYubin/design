package thread.trans.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dingyubin
 */
public class MyService {

    private Lock lock = new ReentrantLock();

    public void testMethode(){
        lock.lock();
        for (int i = 0; i < 5; i ++){
            System.out.println("ThreadName=" + Thread.currentThread().getName() + (" "+(i + 1)));
        }
        lock.unlock();
    }
}
