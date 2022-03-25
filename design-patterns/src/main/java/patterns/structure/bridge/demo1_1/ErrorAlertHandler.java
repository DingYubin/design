package patterns.structure.bridge.demo1_1;

public class ErrorAlertHandler extends AlertHandler{
    public ErrorAlertHandler(AlertRule rule, Notification notification){
        super(rule,notification);
    }

    @Override
    void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()))
        notification.notify(NotificationEmergencyLevel.SEVERE,"紧急事件");
    }

}
