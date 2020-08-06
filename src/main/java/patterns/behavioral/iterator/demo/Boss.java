package patterns.behavioral.iterator.demo;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    public static void main(String[] args) {
        List<IProject> projects = new ArrayList<IProject>();
        projects.add(new Project("星球大战项目",10, 10000));
        projects.add(new Project("扭转时空项目", 100, 1000000));
        projects.add(new Project("超人改造项目", 1000, 100000000));

        for (int i = 4; i < 104; i++){
            projects.add(new Project("第"+i+"个项目",i*5, i*10000000));
        }

        for (IProject project : projects){
            System.out.println(project.getProjectInfo());
        }
    }

}
