package ht12;

public class EmailNotifier {
    private IEmailService emailService;
    
    public EmailNotifier() {
    	
    }

    public EmailNotifier(IEmailService emailService) {
        this.emailService = emailService;
    }

    public void Notify(String recipient, String message) {
        emailService.SendEmail(recipient, "Thông báo", message);
    }
}
