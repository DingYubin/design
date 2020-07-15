package patterns.behavioral.mediator.demo;

public class Mediator extends AbstractMediator{
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")){//采购电脑
            buyComputer((Integer) objects[0]);
        }else if (str.equals("sale.sell")){//销售电脑
            sellComputer((Integer) objects[0]);
        }else if (str.equals("sale.offsell")){//折价销售
            offSell();
        }else if (str.equals("stock.clear")){//清仓处理
            clearStock();
        }
    }

    //采购电脑
    private void buyComputer(int number){
        int saleSatates = super.sale.getSaleStatus();
        if (saleSatates > 80){//销售情况良好
            System.out.println("采购IBM电脑："+number+"台");
            super.stock.increase(number);
        }else {//销售情况不好
            int buyNumber = number/2;//折半采购
            System.out.println("采购IBM电脑："+number+"台");
        }
    }
    //销售电脑
    private void sellComputer(int number){
        if (super.stock.getStockNumber() < number){//库存梳理不够销售
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }
    //折价销售电脑
    private void offSell(){
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }
    //清仓处理
    private void clearStock(){
        //要求清仓处理
        super.sale.offSale();
        //要求采购人员不要采购
        super.purchase.refuseBuyIBM();
    }
}
