
public interface IEmailNotifierBuilder {
    void reset();
    void buildEmailService();
    EmailNotifier getNotifier();
}