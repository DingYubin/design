package patterns.behavioral.observer.demo;

public class HanFeiZi implements IHanFeiZi{
    private boolean isHaveBreakfast = false;
    private boolean isHaveFun = false;
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭...");
        isHaveBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        isHaveFun = true;
    }

    public boolean isHaveBreakfast() {
        return isHaveBreakfast;
    }

    public void setHaveBreakfast(boolean haveBreakfast) {
        isHaveBreakfast = haveBreakfast;
    }

    public boolean isHaveFun() {
        return isHaveFun;
    }

    public void setHaveFun(boolean haveFun) {
        isHaveFun = haveFun;
    }
}
