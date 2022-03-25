package patterns.behavioral.responsibility.demo2;

public class Women implements IWomen {
    /**
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1--未出嫁
     * 2--出嫁
     * 3--夫死
     */
    private int type = 0;
    //妇女的请示
    private String request = "";

    //传递过来请求
    public Women(int type, String request){
        this.type = type;

        switch (this.type){
            case Handler.FATHER_LEVEL_REQUEST:
                this.request="女儿的请求: " + request;
                break;
            case Handler.HUSBAND_LEVEL_REQUEST:
                this.request="女儿的请求: " + request;
                break;
            case Handler.SON_LEVEL_REQUEST:
                this.request="女儿的请求: " + request;
                break;
        }
    }
    //获得自己的状态
    public int getType() {
        return this.type;
    }
    //获的妇女的请求
    public String getRequest() {
        return this.request;
    }
}
