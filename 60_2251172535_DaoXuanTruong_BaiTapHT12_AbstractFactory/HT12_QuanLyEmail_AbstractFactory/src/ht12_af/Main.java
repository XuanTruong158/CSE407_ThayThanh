package ht12_af;

public class Main {
    public static void main(String[] args) {
        // Sử dụng SMTP
        EmailNotifier a = new EmailNotifier(new SmtpEmailServiceCF());
        a.Notify("user@example.com", "Chào bạn!");
        a.Notify("", "Chào bạn!");

        // Sử dụng API
        EmailNotifier b = new EmailNotifier(new ApiEmailServiceCF());
        b.Notify("2251172535@example.com", "Chào bạn!");
        b.Notify("", "Chào bạn!");
        b.Notify("           ", "Chào bạn!");
    }
}