package patterns.structure.bridge.demo1_2;

import java.util.List;

public class WechatMsgSender implements MsgSender{
    private List<String> wechatIds;

    public WechatMsgSender(List<String> wechatIds) {
        this.wechatIds = wechatIds;
    }

    @Override
    public void send(String message) {
        System.out.println("发送消息 ：" + message);
    }
}
