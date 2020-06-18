package patterns.behavioral.responsibility.demo2;

public class Father extends Handler {
    //未出嫁女儿来请示父亲
    public Father(){
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    protected void response(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是：同意");
    }
}
