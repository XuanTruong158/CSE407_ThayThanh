package ht12_af;

public class EmailNotifier {
    private IEmailService emailService;

    public EmailNotifier(EmailServiceAF emailServiceAF) {
        this.emailService = emailServiceAF.creEmailService();
    }

    public void Notify(String recipient, String message) {
        emailService.SendEmail(recipient, "Thông báo", message);
    }
}