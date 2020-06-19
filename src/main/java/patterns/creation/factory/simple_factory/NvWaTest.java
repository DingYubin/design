package patterns.creation.factory.simple_factory;

import patterns.creation.factory.simple_factory.nvwa.*;

public class NvWaTest {
    /**
     * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类
     * @param args
     */
    public static void main(String[] args) {
        AbstractHumanFactory YinYangLu = new HumanFactory();
        System.out.println("--造出的第一批白色人种--");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("--造出的第二批黑色人种--");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("--早出的第三批黄色人种--");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
