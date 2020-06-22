package patterns.structure.bridge.demo1_2;

public class TrivialNotification extends Notification{

    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
