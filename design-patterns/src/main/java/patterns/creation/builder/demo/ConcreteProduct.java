package patterns.creation.builder.demo;

/**
 * 具体创建者
 */
public class ConcreteProduct extends Builder{
    private Product product = new Product();
    //设置产品零件
    public void setPart() {
        System.out.println("产品类内的逻辑处理");
    }
    //组建一个产品
    public Product buildProduct() {
        return product;
    }
}
