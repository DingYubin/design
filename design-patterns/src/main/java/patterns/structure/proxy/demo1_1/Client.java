package patterns.structure.proxy.demo1_1;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间是：2020-6-22 10：45");
        player.login("zhangsan","password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间是：2020-7-30 03:04");
    }
}
