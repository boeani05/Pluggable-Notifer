package app;

import notifier.LoggingNotificationService;
import notifier.SmsService;

public final class SmsInjector implements Injector {
    @Override
    public Consumer getConsumer() {
        return new MyApp(new LoggingNotificationService(new SmsService()));
    }
}
