package thread.trans.wait.notify.demo3;

public class MyThreadA extends Thread{
    private MyService service;

    public MyThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
