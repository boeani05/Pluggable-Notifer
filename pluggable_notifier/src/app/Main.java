package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java app.Main <email|sms|push> <recipient> <message>");
            System.exit(1);
        }

        String channel = args[0].trim().toLowerCase(Locale.ROOT);
        String recipient = args[1].trim();
        String message = args[2];

        if (recipient.isBlank() || message.isBlank()) {
            System.exit(2);
        }

        Injector injector = InjectorFactory.from(channel);

        Consumer app = injector.getConsumer();

        try {
            app.process(message, recipient);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.exit(3);
        }
    }
}
