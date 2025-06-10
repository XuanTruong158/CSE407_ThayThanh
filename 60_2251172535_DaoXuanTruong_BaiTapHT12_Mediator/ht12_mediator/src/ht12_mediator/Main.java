package ht12_mediator;

public class Main {
    public static void main(String[] args) {
        // Có thể thay đổi dịch vụ gửi email tại đây
        IEmailService emailService = new SmtpEmailService(); // hoặc new ApiEmailService();

        IEmailMediator mediator = new ConcreteEmailMediator(emailService);
        EmailNotifier notifier = new EmailNotifier(mediator);

        notifier.sendNotification("Chào bạn! Đây là email thử nghiệm.");
    }
}
