package patterns.creation.factory.simple_factory.nvwa;

public class BlackHuman implements Human{
    public void getColor() {
        System.out.println("黑色人种的皮肤是黑色的！");
    }

    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
