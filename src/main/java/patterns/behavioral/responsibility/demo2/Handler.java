package patterns.behavioral.responsibility.demo2;

public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST=1;
    public final static int HUSBAND_LEVEL_REQUEST=2;
    public final static int SON_LEVEL_REQUEST=3;
    //能处理的级别
    private int level = 0;
    //责任传递，下一个人责任人是谁
    private Handler nextHandler;
    //每个类都要说明一下自己能处理那些请求
    public Handler(int level){
        this.level = level;
    }
    //一个女性要求逛街，你要处理这个请求
    public final void handleMessage(IWomen women){
        if (women.getType() == this.level){
            this.response(women);
        }else {
            if (this.nextHandler != null){//有后续环节，才把请求传递
                this.nextHandler.handleMessage(women);
            }else {
                System.out.println("---没地方请示，按不同意处理---");
            }
        }
    }

    /**
     * 如果不属于你处理的请求，你应该让她找下一个环节的人
     */
    public void setNext(Handler handler){
        this.nextHandler =  handler;
    }

    //模板方法模式
    protected abstract void response(IWomen women);
}
