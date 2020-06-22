package patterns.structure.proxy.demo1_3;


import patterns.structure.proxy.demo1_2.IGamePlayer;

public class Client {
    public static void main(String[] args) {
        GamePlayer player = new GamePlayerProxy("张三");

        System.out.println("开始时间是：2020-6-22 10：45");
        player.login("zhangsan","password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间是：2020-7-30 03:04");
    }
}
