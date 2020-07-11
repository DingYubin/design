package patterns.creation.singleton;

import patterns.creation.singleton.demo.Emperor;

public class MinisterTest {
    /**
     * 单例模式：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
     * @param args
     */
    public static void main(String[] args) {
        for (int day = 0; day < 3; day++){
            Emperor emperor = Emperor.getInstance();
//            System.out.println(emperor.toString());
            emperor.say();
        }
    }
}
