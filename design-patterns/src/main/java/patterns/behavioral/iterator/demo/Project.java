package patterns.behavioral.iterator.demo;

public class Project implements IProject{
    //项目名称
    private String name="";
    //项目成员数量
    private int num = 0;
    //项目金费
    private int cost = 0;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        //获取项目的名称
        info = info+ "项目名称是："+this.name;
        //获得项目人数
        info = info + "\t项目人数："+this.num;
        //花费金费
        info = info + "\t项目花费: " + this.cost;
        return info;
    }
}
