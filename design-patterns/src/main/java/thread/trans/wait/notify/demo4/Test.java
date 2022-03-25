package thread.trans.wait.notify.demo4;

public class Test {
    public static void main(String[] args) throws InterruptedException{
        MyService service = new MyService();

        for (int i = 0; i < 10; i++){
            MyThreadA t1 = new MyThreadA(service);
            t1.start();//异步操作，是乱序的
        }

        Thread.sleep(500);

        MyThreadB t1 = new MyThreadB(service);
        t1.start();
        Thread.sleep(500);
        MyThreadB t2 = new MyThreadB(service);
        t2.start();
        Thread.sleep(500);
        MyThreadB t3 = new MyThreadB(service);
        t3.start();
        Thread.sleep(500);
        MyThreadB t4 = new MyThreadB(service);
        t4.start();
        Thread.sleep(500);
        MyThreadB t5 = new MyThreadB(service);
        t5.start();
    }
}
