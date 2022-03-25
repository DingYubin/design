package patterns.behavioral.mediator.demo;

import java.util.Random;

public class Sale extends AbstractCollleague{
    public Sale(AbstractMediator mediaator) {
        super(mediaator);
    }
    //销售IBM电脑
    public void sellIBMComputer(int number){
        super.mediator.execute("sale.sell",number);
        System.out.println("销售IBM电脑"+number+"台");
    }
    //反馈销售情况，0~100之间变化，0代表根本就没人买，100代表非常畅销，出一个卖一个
    public int getSaleStatus(){
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;
    }
    //折价处理
    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}
