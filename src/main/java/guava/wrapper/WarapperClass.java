package guava.wrapper;

/**
 * @author dingyubin
 * wrapper类二次封装原始类。
 * 实现方式：委托原始类
 */
public class WarapperClass implements Interf{
    private OriginalClass oc;

    public WarapperClass(OriginalClass oc){
        this.oc = oc;
    }

    @Override
    public void f1() {
        //...附加功能
       this.oc.f1();
        //...附加功能
    }

    @Override
    public void f2() {
        this.oc.f2();
    }
}
