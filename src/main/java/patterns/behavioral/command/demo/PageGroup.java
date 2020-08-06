package patterns.behavioral.command.demo;

public class PageGroup extends Group{
    @Override
    public void find() {
        System.out.println("找到美工组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一张ui...");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一张ui...");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一张ui...");
    }

    @Override
    public void plan() {
        System.out.println("客户要求变更ui计划...");
    }
}
