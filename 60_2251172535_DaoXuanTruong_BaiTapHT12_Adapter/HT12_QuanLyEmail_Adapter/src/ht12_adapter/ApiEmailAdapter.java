package ht12_adapter;

public class ApiEmailAdapter implements IEmailService {
    private ApiEmailService apiAdaptee;

    public ApiEmailAdapter(ApiEmailService apiAdaptee) {
        this.apiAdaptee = apiAdaptee;
    }

    @Override
    public boolean SendEmail(String to, String subject, String body) {
        return apiAdaptee.SendViaApi(to, subject, body);
    }
}