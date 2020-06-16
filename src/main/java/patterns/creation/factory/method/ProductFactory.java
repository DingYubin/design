package patterns.creation.factory.method;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟加载的工厂类
 * 缓存
 */
public class ProductFactory {

    private static final Map<String, Product> map = new HashMap<String, Product>();

    public static synchronized Product createProduct(String type) throws Exception{

        Product product = null;
        //如果Map已经有这个对象
        if (map.containsKey(type)){
            product = map.get(type);
        }else {
            if (type.equals("Product1")){
                product = new ConcreteProduct1();
            }else {
                product = new ConcreteProduct2();
            }
            //把对象缓存在map中
            map.put(type, product);
        }
        return product;
    }
}
