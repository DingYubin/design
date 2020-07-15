package patterns.behavioral.mediator;

public class ConcreteColleague2 extends Colleague{
    //通过构造函数传递中介
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }
    //自由方法self-method
    public void selfMethod2(){
        //处理自己的业务逻辑
        System.out.println("selfMethod2 处理自己的业务逻辑");
    }
    //依赖方法dep-method
    public void depMethod2(){
        //处理自己的业务逻辑
        System.out.println("depMethod2 处理自己的业务逻辑");
        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething2();
    }
}
