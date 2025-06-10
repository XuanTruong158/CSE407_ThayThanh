package ht12_strategy;

public class Main {
    public static void main(String[] args) {
        EmailContext context = new EmailContext();

        // Gửi qua SMTP
        IEmailStrategy smtp = new SmtpEmailStrategy();
        context.setStrategy(smtp);
        context.sendEmail("Chào bạn! Đây là email gửi bằng SMTP.");

        // Gửi qua API
        IEmailStrategy api = new ApiEmailStrategy();
        context.setStrategy(api);
        context.sendEmail("Xin chào! Đây là email gửi bằng API.");
    }
}
