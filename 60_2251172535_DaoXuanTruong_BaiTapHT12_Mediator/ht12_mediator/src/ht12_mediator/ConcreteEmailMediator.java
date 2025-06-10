package ht12_mediator;

public class ConcreteEmailMediator implements IEmailMediator {
    private IEmailService emailService;

    public ConcreteEmailMediator(IEmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void notify(String message) {
        emailService.sendEmail(message);
    }
}
