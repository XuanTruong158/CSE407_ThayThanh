package ht12_fm;

public class Main {
    public static void main(String[] args) {
        // Sử dụng SMTP
        EmailNotifier a = new EmailNotifier(new SmtpEmailServiceFM());
        a.Notify("user@example.com", "Chào bạn!");
        a.Notify("", "Chào bạn!");

        // Sử dụng API
        EmailNotifier b = new EmailNotifier(new ApiEmailServiceFM());
        b.Notify("2251172535@example.com", "Chào bạn!");
        b.Notify("", "Chào bạn!");
        b.Notify("           ", "Chào bạn!");
    }
}


