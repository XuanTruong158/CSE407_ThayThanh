
public class ApiNotifierBuilder implements IEmailNotifierBuilder {
    private EmailNotifier result;

    @Override
    public void reset() {
        result = null;
    }

    @Override
    public void buildEmailService() {
        IEmailService apiService = new ApiEmailService();
        result = new EmailNotifier(apiService);
    }

    @Override
    public EmailNotifier getNotifier() {
        return result;
    }
}
