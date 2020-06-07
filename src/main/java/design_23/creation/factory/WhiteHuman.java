package design_23.creation.factory;

public class WhiteHuman implements Human{
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的！");
    }

    public void talk() {
        System.out.println("白色人会说话，一般都是单字节。");
    }
}
