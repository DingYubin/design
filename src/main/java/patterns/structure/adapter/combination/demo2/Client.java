package patterns.structure.adapter.combination.demo2;

public class Client {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
