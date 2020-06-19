package patterns.creation.singleton.demo;

/**
 * 单例：皇帝类
 */
public class Emperor {

    private static final Emperor emperor = new Emperor();

    private Emperor(){}

    public static Emperor getInstance(){
        return emperor;
    }


    public void say(){
        System.out.println("我是皇帝XXX.....");
    }
}
