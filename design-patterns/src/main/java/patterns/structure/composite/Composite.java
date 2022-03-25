package patterns.structure.composite;

import java.util.ArrayList;

public class Composite extends Component{
    //构建容器
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();
    //添加一个叶子构建或者树枝构建
    public void add(Component component){
        this.componentArrayList.add(component);
    }
    //删除一个叶子构建或者树枝构建
    public void remove(Component component){
        this.componentArrayList.remove(component);
    }
    //获得分支下的所有叶子构建和树枝构建
    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }
}
