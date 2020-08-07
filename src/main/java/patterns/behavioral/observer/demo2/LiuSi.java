package patterns.behavioral.observer.demo2;

public class LiuSi implements Observer {
    @Override
    public void update(String str) {
        System.out.println("刘斯：观察到韩非子活动，自己也开始动作了...");
        this.happy(str);
        System.out.println("刘斯：乐死了...\n");
    }

    public void happy(String context){
        System.out.println("刘斯：因为" + context +"--所有我快乐呀！");
    }
}
