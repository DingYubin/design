package patterns.structure.proxy.demo1_5;

/**
 * 强制代理类
 */
public class Client {
    public static void main(String[] args) {
//        IGamePlayer player = new GamePlayer("张三");
//
//        System.out.println("开始时间是：2020-6-22 10：45");
//        player.login("zhangsan","password");
//        player.killBoss();
//        player.upgrade();
//        System.out.println("结束时间是：2020-7-30 03:04");

//        IGamePlayer player = new GamePlayer("张三");
//        //然后再定义一个代练者
//        IGamePlayer proxy = new GamePlayerProxy(player);
//        System.out.println("开始时间是：2020-6-22 10：45");
//        proxy.login("zhangsan","password");
//        proxy.killBoss();
//        proxy.upgrade();
//        System.out.println("结束时间是：2020-7-30 03:04");

        IGamePlayer player = new GamePlayer("张三");
        //然后再定义一个代练者
        IGamePlayer proxy = player.getProxy();
        System.out.println("开始时间是：2020-6-22 10：45");
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：2020-7-30 03:04");
    }
}
