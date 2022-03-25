package patterns.structure.bridge.demo1_2;

import java.util.List;

public class EmailMsgSender implements MsgSender{
    private List<String> emailAddresses;

    public EmailMsgSender(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    @Override
    public void send(String message) {
        System.out.println("发送消息 ：" + message);
    }
}
