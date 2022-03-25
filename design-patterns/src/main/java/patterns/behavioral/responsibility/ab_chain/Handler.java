package patterns.behavioral.responsibility.ab_chain;

public abstract class Handler {
    private Handler nextHandler;

    public final Response handleMessage(Request request){
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())){
            response = this.echo(request);
        }else {//不属于自己的处理级别
            //判断是否有下一个处理者
            if (this.nextHandler != null){
                response = this.nextHandler.handleMessage(request);
            }else {
                System.out.println("没有适当的处理者，业务自行处理");
            }
        }
        return response;
    }
    //蛇者下一个处理者是谁
    public void setNext(Handler handler){
        this.nextHandler = handler;
    }
    //每个处理都有一个处理级别
    protected abstract Level getHandlerLevel();
    //每个处理者都必须实现处理任务
    protected abstract Response echo(Request request);
}
