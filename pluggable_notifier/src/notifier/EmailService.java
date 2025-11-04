package notifier;

public class EmailService implements NotificationService {
    @Override
    public void send(String message, String recipient) {
        System.out.println("[EMAIL] to " + recipient + " :: " + message);

    }
}
