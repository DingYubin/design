package patterns.behavioral.mediator.demo;

public class Purchase extends AbstractCollleague{

    public Purchase(AbstractMediator mediaator) {
        super(mediaator);
    }
    //采购IBM电脑
    public void buyIBMcomputer(int number){
        super.mediaator.execute("purchase.buy",number);
    }
    //不再采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
