package ht12_strategy;

public class SmtpEmailStrategy implements IEmailStrategy {
    @Override
    public void send(String message) {
        System.out.println("SMTP Strategy: Đã gửi email với nội dung: " + message);
    }
}
