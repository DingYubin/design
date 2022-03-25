package patterns.behavioral.mediator.demo;

public class Stock extends AbstractCollleague{
    public Stock(AbstractMediator mediaator) {
        super(mediaator);
    }
    //刚开始有100台电脑
    private static int COMPTER_NUMBER = 100;
    //库存增加
    public void increase(int number){
        COMPTER_NUMBER = COMPTER_NUMBER + number;
        System.out.println("库存数量为："+COMPTER_NUMBER);
    }
    //库存降低
    public void decrease(int number){
        COMPTER_NUMBER = COMPTER_NUMBER - number;
        System.out.println("库存数量为："+COMPTER_NUMBER);
    }
    //获得库存梳理
    public int getStockNumber(){
        return COMPTER_NUMBER;
    }
    //存货压力太大了，就要通知采购人员不要采购，销售人员要尽快销售
    public void clearStock(){
        System.out.println("清理存货数量为："+COMPTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
