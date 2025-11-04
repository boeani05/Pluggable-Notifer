package app;

import notifier.LoggingNotificationService;
import notifier.PushService;

public final class PushInjector implements Injector {
    @Override
    public Consumer getConsumer() {
        return new MyApp(new LoggingNotificationService(new PushService()));
    }
}
