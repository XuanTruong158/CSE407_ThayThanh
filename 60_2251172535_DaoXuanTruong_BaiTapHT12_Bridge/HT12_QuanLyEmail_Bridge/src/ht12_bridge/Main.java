package ht12_bridge;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Test với SMTP =====");
        IEmailService smtpService = new SmtpEmailService();
        EmailNotifier smtpNotifier = new EmailNotifier(smtpService);
        smtpNotifier.notifySend("user@example.com", "Chào bạn!");
        smtpNotifier.notifySend("", "Chào bạn!");
        smtpNotifier.notifySend("   ", "Chào bạn!");

        System.out.println("\n===== Test với API =====");
        IEmailService apiService = new ApiEmailService();
        EmailNotifier apiNotifier = new EmailNotifier(apiService);
        apiNotifier.notifySend("2251172535@example.com", "Chào bạn!");
        apiNotifier.notifySend("", "Chào bạn!");
        apiNotifier.notifySend("   ", "Chào bạn!");

        System.out.println("\n===== Test với EmailNotifierRA kế thừa =====");
        EmailNotifierRA notifierRA = new EmailNotifierRA(smtpService);
        notifierRA.notifySend("ra_user@example.com", "Nội dung gửi nâng cao");
        notifierRA.notifyEdit("old@example.com", "new@example.com");
        notifierRA.notifyDelete("new@example.com");
    }
}
