package patterns.creation.factory.nvwa;

public class HumanFactory extends AbstractHumanFactory{
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try{
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (Exception e) {
            System.out.println("人种生成错误");
        }
        return (T) human;
    }
}
