package ht12_fm;

public class ApiEmailServiceFM extends EmailServiceFM {
    @Override
    public IEmailService creEmailService() {
        return new ApiEmailService();
    }
}