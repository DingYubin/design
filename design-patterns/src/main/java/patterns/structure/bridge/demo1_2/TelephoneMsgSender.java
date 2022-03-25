package patterns.structure.bridge.demo1_2;

import java.util.List;

public class TelephoneMsgSender implements MsgSender{
    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        System.out.println("发送消息 ：" + message);
    }
}
