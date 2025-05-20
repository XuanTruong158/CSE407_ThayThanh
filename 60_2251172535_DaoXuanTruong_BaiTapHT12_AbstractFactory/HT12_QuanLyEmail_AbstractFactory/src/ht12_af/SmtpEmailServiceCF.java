package ht12_af;

public class SmtpEmailServiceCF implements EmailServiceAF {
    @Override
    public IEmailService creEmailService() {
        return new SmtpEmailService();
    }
}
