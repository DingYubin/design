package thread.trans.lock.produce1;

public class Run {
    public static void main(String[] args) throws InterruptedException{
        MyService myService = new MyService();

        MyThreadA[] threadAS = new MyThreadA[10];
        MyThreadB[] threadBS = new MyThreadB[10];
        for (int i = 0; i < 10; i++){
            threadAS[i] = new MyThreadA(myService);
            threadBS[i] = new MyThreadB(myService);

            threadAS[i].start();
            threadBS[i].start();
        }
    }
}
