package ht12_fm;

public class SmtpEmailServiceFM extends EmailServiceFM {
    @Override
    public IEmailService creEmailService() {
        return new SmtpEmailService();
    }
}
