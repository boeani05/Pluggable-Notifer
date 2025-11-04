package notifier;

import java.time.Instant;

public record LoggingNotificationService(NotificationService inner) implements NotificationService {
    public LoggingNotificationService {
        if (inner == null) {
            throw new IllegalArgumentException("inner cannot be null");
        }

    }

    @Override
    public void send(String message, String recipient) {
        System.out.printf("[LOG %s] %s via %s -> %s\n",
                Instant.now(),
                message,
                inner.getClass().getSimpleName(),
                recipient
                );
        inner.send(message, recipient);
    }
}
