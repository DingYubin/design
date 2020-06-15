package patterns.creation.factory;

public class YellowHuman implements Human{
    public void getColor() {
        System.out.println("黄色人种的皮肤是黄色的！");
    }

    public void talk() {
        System.out.println("黄色人会说话，一般都是双字节。");
    }
}
