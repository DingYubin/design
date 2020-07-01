package patterns.structure.decoration;

/**
 * 动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成子类更加灵活
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次修饰
        component = new ConcreteDecorator1(component);
        //第二次修饰
        component = new ConcreteDecorator2(component);
        //修饰后运行
        component.operate();
    }
}
