package patterns.creation.factory.simple_factory;

import patterns.creation.factory.simple_factory.method.ConcreteCreate;
import patterns.creation.factory.simple_factory.method.ConcreteProduct1;
import patterns.creation.factory.simple_factory.method.Creator;
import patterns.creation.factory.simple_factory.method.Product;

/**
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreate();
        Product product = creator.createProduct(ConcreteProduct1.class);
        product.method2();
    }
}
