package patterns.structure.proxy.demo1_3;

public class GamePlayerProxy extends GamePlayer{

    public GamePlayerProxy(String name) {
        super(name);
    }

    @Override
    public void login(String user, String password) {
        //do something
        super.login(user,password);
        //do something
    }

    @Override
    public void killBoss() {
        //do something
        super.killBoss();
        //do something
    }

    @Override
    public void upgrade() {
        //do something
        super.upgrade();
        //do something
    }
}
