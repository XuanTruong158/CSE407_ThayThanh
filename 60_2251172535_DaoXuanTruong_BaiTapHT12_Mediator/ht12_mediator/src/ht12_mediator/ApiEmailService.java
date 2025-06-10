package ht12_mediator;

public class ApiEmailService implements IEmailService {
    @Override
    public void sendEmail(String message) {
        System.out.println("API Service: Đã gửi email với nội dung: " + message);
    }
}
