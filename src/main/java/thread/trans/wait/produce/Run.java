package thread.trans.wait.produce;

public class Run {
    public static void main(String[] args) {

        String lock = new String("");
        Producer p = new Producer(lock);
        Customer c = new Customer(lock);

        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(c);

        pThread.start();
        cThread.start();
    }
}
