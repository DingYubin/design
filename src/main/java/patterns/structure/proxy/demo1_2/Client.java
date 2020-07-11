package patterns.structure.proxy.demo1_2;


public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        //定义一个痴迷的代练者
        IGamePlayer proxy = new GamePlayerProxy(player);

        System.out.println("开始时间是：2020-6-22 10：45");
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：2020-7-30 03:04");
    }
}
