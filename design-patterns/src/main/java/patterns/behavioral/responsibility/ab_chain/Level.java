package patterns.behavioral.responsibility.ab_chain;

public enum Level {
    //定义一个请求和处理等级
    FATHER_LEVEL_REQUEST("FATHER_REQUEST",1),
    HUSBAND_LEVEL_REQUEST("HUSBAND_REQUEST",2),
    SON_LEVEL_REQUEST("SON_REQUEST",3);

    private String message;
    private int level;

    Level(String message, int level) {
        this.message = message;
        this.level = level;
    }
}
