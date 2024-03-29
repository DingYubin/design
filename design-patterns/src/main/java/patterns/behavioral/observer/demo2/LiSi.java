package patterns.behavioral.observer.demo2;

public class LiSi implements Observer {
    @Override
    public void update(String str) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQiShiHuang(str);
        System.out.println("李斯：汇报完毕...\n");
    }

    public void reportToQiShiHuang(String reportContext){
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
    }
}
