package patterns.structure.bridge.demo1_2;

public class NormalNotification extends Notification{

    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
