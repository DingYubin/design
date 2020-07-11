package patterns.behavioral.visitor;

import patterns.behavioral.visitor.visitor_demo1_2.CommonEmployee;
import patterns.behavioral.visitor.visitor_demo1_2.Employee;
import patterns.behavioral.visitor.visitor_demo1_2.Manager;
import patterns.behavioral.visitor.visitor_demo1_2.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ClientDemo2 {
    public static void main(String[] args) {
        for (Employee emp:mockEmployee()){
            emp.accept(new Visitor());
        }
    }
    //模拟出公司的人员情况，我们可以想象这个数据是通过持久层传递过来的
    public static List<Employee> mockEmployee(){
        List<Employee> empList = new ArrayList<Employee>();
        //产生张三这个员工
        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setJob("编写java程序，绝对的蓝领、苦工加搬运工");
        zhangsan.setName("张三");
        zhangsan.setSalary(1800);
        zhangsan.setSex(Employee.MALE);
        empList.add(zhangsan);
        //产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("编写java程序，绝对的蓝领、苦工加搬运工");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
        //再产生一个经理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}
