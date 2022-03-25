package patterns.structure.decoration;

public class ConcreteComponent extends Component{
    @Override
    public void operate() {
        System.out.println("do Something");
    }
}
