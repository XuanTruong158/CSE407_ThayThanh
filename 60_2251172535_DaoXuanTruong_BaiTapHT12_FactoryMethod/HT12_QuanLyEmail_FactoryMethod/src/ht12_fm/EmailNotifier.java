package ht12_fm;

public class EmailNotifier {
    private IEmailService emailService;
    
    public EmailNotifier() {
    	
    }

    public EmailNotifier(EmailServiceFM emailService) {
        this.emailService = emailService.creEmailService();
    }

    public void Notify(String recipient, String message) {
        emailService.SendEmail(recipient, "Thông báo", message);
    }
}
