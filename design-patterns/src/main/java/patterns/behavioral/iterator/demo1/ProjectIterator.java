package patterns.behavioral.iterator.demo1;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator{
    private ArrayList<IProject> projectList;
    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    //判断是否还有元素
    @Override
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null){
            b = false;
        }
        return b;
    }

    @Override
    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }

    @Override
    public void remove() {
        //暂时没有用
    }
}
