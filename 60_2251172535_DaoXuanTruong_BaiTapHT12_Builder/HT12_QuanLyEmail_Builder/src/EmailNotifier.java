public class EmailNotifier {
    private IEmailService emailService;

    public EmailNotifier(IEmailService emailService) {
        this.emailService = emailService;
    }

    public void notify(String recipient, String message) {
        emailService.SendEmail(recipient, "Thông báo", message);
    }
}