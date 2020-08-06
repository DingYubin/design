package patterns.behavioral.command.demo;

public class Client {
    public static void main(String[] args) {
        Invoker xiaoSan = new Invoker();
//        System.out.println("---客户要求增加一项需求---");
        System.out.println("---客户要求删除一个页面---");
//        Command command = new AddRequirementCommand();
        Command command = new DeletePageCommand();
        xiaoSan.setCommand(command);
        xiaoSan.action();
    }
}
