package patterns.creation.client;

import patterns.creation.factory.abstract_factory.nvwa.Human;
import patterns.creation.factory.abstract_factory.nvwa.HumanFactory;
import patterns.creation.factory.abstract_factory.nvwa.MaleFactory;

public class NvWaAbsTest {
    /**
     * 抽象工厂模式：为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类
     * @param args
     */
    public static void main(String[] args) {
        //第一条生产线，男性生成线
        HumanFactory maleHumanFactory = new MaleFactory();
        //第二条生产线，女性生成线
        HumanFactory femaleHumanFactory = new MaleFactory();

        //生产线建立完毕，开始生成人
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();

        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        System.out.println("---生产一个黄色女性---");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSix();

        System.out.println("---生产一个黄色男性---");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSix();

    }
}
