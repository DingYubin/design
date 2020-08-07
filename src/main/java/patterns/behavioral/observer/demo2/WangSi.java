package patterns.behavioral.observer.demo2;

public class WangSi implements Observer {
    @Override
    public void update(String str) {
        System.out.println("王斯：观察到韩非子活动，自己也开始活动了...");
        this.cry(str);
        System.out.println("王斯：哭死了...\n");
    }

    public void cry(String context){
        System.out.println("王斯：因为" + context +"--所有我悲伤呀！");
    }
}
