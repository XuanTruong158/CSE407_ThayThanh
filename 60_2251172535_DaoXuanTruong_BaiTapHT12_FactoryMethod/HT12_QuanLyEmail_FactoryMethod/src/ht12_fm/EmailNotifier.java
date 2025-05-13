package ht12_fm;

public class EmailNotifier {
    private IEmailService emailService;

    public EmailNotifier(EmailServiceFM emailServiceFM) {
        this.emailService = emailServiceFM.creEmailService();
    }

    public void Notify(String recipient, String message) {
        emailService.SendEmail(recipient, "Thông báo", message);
    }
}
