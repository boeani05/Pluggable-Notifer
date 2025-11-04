package app;

public interface Consumer {
    void process(String message, String recipient);
}
