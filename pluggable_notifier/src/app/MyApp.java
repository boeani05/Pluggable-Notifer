package app;

import notifier.NotificationService;

public record MyApp(NotificationService service) implements Consumer {
    public MyApp {
        if (service == null) {
            throw new IllegalArgumentException("service cannot be null");
        }

    }

    @Override
    public void process(String message, String recipient) {
        if (message == null || recipient == null || recipient.isBlank()) {
            throw new IllegalArgumentException("cannot be blank");
        }
        service.send(message, recipient);
    }
}
