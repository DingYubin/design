package thread.trans.demo3_1;

public class ThreadB extends Thread{
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true){
//                Thread.sleep(2000); //线程B在空转，永远停止不了了。
                if (list.size() == 5){
                    System.out.println("==5了，线程b要推出了！");
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
