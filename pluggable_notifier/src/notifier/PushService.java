package notifier;

public class PushService implements NotificationService {
    @Override
    public void send(String message, String recipient) {
        System.out.println("[PUSH] to " + recipient + " :: " + message);
    }
}
