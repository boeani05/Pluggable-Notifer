package notifier;

public class SmsService implements NotificationService {
    @Override
    public void send(String message, String recipient) {
        System.out.println("[SMS] to " + recipient + " :: " + message);
    }
}
