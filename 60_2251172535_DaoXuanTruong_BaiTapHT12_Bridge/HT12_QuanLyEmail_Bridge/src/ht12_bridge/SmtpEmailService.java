package ht12_bridge;

public class SmtpEmailService implements IEmailService {

    @Override
    public boolean sendEmail(String to, String subject, String body) {
        if (to == null || to.trim().isEmpty()) {
            System.out.println("Địa chỉ email không hợp lệ");
            return false;
        }
        System.out.println("Gửi email tới " + to + " thông qua SMTP");
        return true;
    }

    @Override
    public boolean deleteEmail(String email) {
        System.out.println("Xóa email: " + email + " thông qua SMTP");
        return true;
    }

    @Override
    public boolean editEmail(String email, String newEmail) {
        System.out.println("Chỉnh sửa email: " + email + " -> " + newEmail + " thông qua SMTP");
        return true;
    }
}
