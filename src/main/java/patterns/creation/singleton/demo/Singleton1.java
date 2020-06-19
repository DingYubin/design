package patterns.creation.singleton.demo;

/**
 * 单例：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 * 饿汉式
 */
public class Singleton1 {
    private static final Singleton1 singleton = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return singleton;
    }

    public void showMessage(){
        System.out.println("Hello world!");
    }
}
