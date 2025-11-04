package app;

import notifier.EmailService;
import notifier.LoggingNotificationService;

public final class EmailInjector implements Injector {
    @Override
    public Consumer getConsumer() {
        return new MyApp(new LoggingNotificationService(new EmailService()));
    }
}
