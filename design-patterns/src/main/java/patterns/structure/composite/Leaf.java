package patterns.structure.composite;

public class Leaf extends Component{
    @Override
    public void doSomething() {
        //可以覆写父类方法
        System.out.println("子类进行中");
    }
}
