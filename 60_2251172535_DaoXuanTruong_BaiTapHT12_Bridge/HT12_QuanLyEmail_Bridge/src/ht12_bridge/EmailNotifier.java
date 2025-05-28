package ht12_bridge;

public class EmailNotifier {
    protected IEmailService emailService;

    public EmailNotifier(IEmailService emailService) {
        this.emailService = emailService;
    }

    public void notifySend(String recipient, String message) {
        emailService.sendEmail(recipient, "Thông báo", message);
    }

    public void notifyDelete(String email) {
        emailService.deleteEmail(email);
    }

    public void notifyEdit(String email, String newEmail) {
        emailService.editEmail(email, newEmail);
    }
}
