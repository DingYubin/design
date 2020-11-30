package thread.trans.wait.notifyAll;


public class MyThreadB extends Thread{
    private MyService service;

    public MyThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
