
public class SmtpNotifierBuilder implements IEmailNotifierBuilder {
    private EmailNotifier result;

    @Override
    public void reset() {
        result = null;
    }

    @Override
    public void buildEmailService() {
        IEmailService smtpService = new SmtpEmailService();
        result = new EmailNotifier(smtpService);
    }

    @Override
    public EmailNotifier getNotifier() {
        return result;
    }
}
