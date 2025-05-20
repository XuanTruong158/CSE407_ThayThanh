package ht12_af;

public class ApiEmailServiceCF implements EmailServiceAF {
    @Override
    public IEmailService creEmailService() {
        return new ApiEmailService();
    }
}