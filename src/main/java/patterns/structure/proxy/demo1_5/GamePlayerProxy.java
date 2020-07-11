package patterns.structure.proxy.demo1_5;

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

//    public GamePlayerProxy(String name) {
//        try {
//            gamePlayer = new GamePlayer(name);
//        }catch (Exception e){
//            //TODO 异常处理
//        }
//    }

    public GamePlayerProxy(IGamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
