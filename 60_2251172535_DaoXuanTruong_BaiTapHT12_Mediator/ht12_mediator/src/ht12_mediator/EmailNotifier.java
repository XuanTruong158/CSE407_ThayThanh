package ht12_mediator;

public class EmailNotifier {
    private IEmailMediator mediator;

    public EmailNotifier(IEmailMediator mediator) {
        this.mediator = mediator;
    }

    public void sendNotification(String message) {
        System.out.println("Notifier: Gửi yêu cầu gửi email...");
        mediator.notify(message);
    }
}
