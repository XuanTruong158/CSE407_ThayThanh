package ht12_adapter;

public class Main {
    public static void main(String[] args) {
        // Dùng SMTP
        IEmailService smtp = new SmtpEmailAdapter(new SmtpEmailService());
        EmailNotifier notifier1 = new EmailNotifier(smtp);
        notifier1.notify("abc@gmail.com", "Chào từ SMTP");
        notifier1.notify("", "Chào từ SMTP");
        notifier1.notify("    ", "Chào từ SMTP");

        // Dùng API
        IEmailService api = new ApiEmailAdapter(new ApiEmailService());
        EmailNotifier notifier2 = new EmailNotifier(api);
        notifier2.notify("2251172535@gmail.com", "Chào từ API");
        notifier2.notify("", "Chào từ API");
        notifier2.notify("    ", "Chào từ API");
    }
}