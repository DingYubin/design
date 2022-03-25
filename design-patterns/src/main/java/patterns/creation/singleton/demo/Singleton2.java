package patterns.creation.singleton.demo;

/**
 * 懒汉式
 * 注意线程安全
 */
public class Singleton2 {
    private volatile static  Singleton2 singleton;
    private Singleton2(){}

    public static Singleton2 getInstance(){
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null){
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
