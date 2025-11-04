package app;

import java.util.Locale;

public class InjectorFactory {
    private InjectorFactory() {}

    public static Injector from(String channel) {
        if (channel == null || channel.isBlank()) {
            throw new IllegalArgumentException("channel has to be valid");
        }

        return switch (channel.trim().toLowerCase(Locale.ROOT)) {
            case "email" -> new EmailInjector();
            case "sms" -> new SmsInjector();
            case "push" -> new PushInjector();
            default -> throw new IllegalArgumentException("invalid input (email|sms|push)");
        };
    }
}
