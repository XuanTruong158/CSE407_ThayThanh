package ht12_adapter;

public class ApiEmailAdapter implements IEmailService {
    private ApiEmailService api;

    public ApiEmailAdapter(ApiEmailService api) {
        this.api = api;
    }

    @Override
    public boolean SendEmail(String to, String subject, String body) {
        return api.SendViaApi(to, subject, body);
    }
}