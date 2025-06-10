package ht12_mediator;

public class SmtpEmailService implements IEmailService {
    @Override
    public void sendEmail(String message) {
        System.out.println("SMTP Service: Đã gửi email với nội dung: " + message);
    }
}
