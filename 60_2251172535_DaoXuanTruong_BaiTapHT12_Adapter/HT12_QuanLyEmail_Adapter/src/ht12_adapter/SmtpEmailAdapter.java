package ht12_adapter;

public class SmtpEmailAdapter implements IEmailService {
    private SmtpEmailService smtpAdaptee;

    public SmtpEmailAdapter(SmtpEmailService smtpAdaptee) {
        this.smtpAdaptee = smtpAdaptee;
    }

    @Override
    public boolean SendEmail(String to, String subject, String body) {
        return smtpAdaptee.SendViaSmtp(to, subject, body);
    }
}
