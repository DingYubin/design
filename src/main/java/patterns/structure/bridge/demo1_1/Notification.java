package patterns.structure.bridge.demo1_1;

import java.util.List;

public class Notification {
    private List<String> emailAddresses;
    private List<String> telephones;
    private List<String> wechatIds;

    public Notification(){}

    public void setEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public void setTelephones(List<String> telephones) {
        this.telephones = telephones;
    }

    public void setWechatIds(List<String> wechatIds) {
        this.wechatIds = wechatIds;
    }

    public void notify(NotificationEmergencyLevel level, String message){
        if (level.equals(NotificationEmergencyLevel.SEVERE)){
            System.out.println("严重事件，自动语音电话");
        }else if (level.equals(NotificationEmergencyLevel.URGENCY)){
            System.out.println("紧急事件，发微信");
        }else if (level.equals(NotificationEmergencyLevel.NORMAL)){
            System.out.println("正常事件，发邮件");
        }else if (level.equals(NotificationEmergencyLevel.TRIVIAL)){
            System.out.println("不重要事件，发邮件");
        }
    }
}
