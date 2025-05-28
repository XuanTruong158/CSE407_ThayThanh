package ht12_adapter;

public class SmtpEmailAdapter implements IEmailService {
    private SmtpEmailService smtp;

    public SmtpEmailAdapter(SmtpEmailService smtp) {
        this.smtp = smtp;
    }

    @Override
    public boolean SendEmail(String to, String subject, String body) {
        return smtp.SendViaSmtp(to, subject, body);
    }
}
