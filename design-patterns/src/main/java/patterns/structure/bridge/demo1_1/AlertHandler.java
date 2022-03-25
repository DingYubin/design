package patterns.structure.bridge.demo1_1;

public abstract class AlertHandler {
    protected Notification notification;
    protected AlertRule rule;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    abstract void check(ApiStatInfo apiStatInfo);
}
