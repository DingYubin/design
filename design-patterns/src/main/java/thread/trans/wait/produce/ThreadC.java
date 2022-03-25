package thread.trans.wait.produce;

public class ThreadC extends Thread{

    private Customer c;

    public ThreadC(Customer c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}
