package ht12_bridge;

public class EmailNotifierRA extends EmailNotifier {

    public EmailNotifierRA(IEmailService emailService) {
        super(emailService);
    }

    @Override
    public void notifySend(String recipient, String message) {
        System.out.println("Gửi thông báo nâng cao:");
        super.notifySend(recipient, message);
    }

    @Override
    public void notifyDelete(String email) {
        System.out.println("Thông báo xóa email:");
        super.notifyDelete(email);
    }

    @Override
    public void notifyEdit(String email, String newEmail) {
        System.out.println("Thông báo chỉnh sửa email:");
        super.notifyEdit(email, newEmail);
    }
}
