package ht12_adapter;

class SmtpEmailService{
    public boolean SendViaSmtp(String to, String subject, String body) {
        if (to == null || to.trim().isEmpty()) {
            System.out.println("Địa chỉ email không hợp lệ (SMTP)");
            return false;
        }
        System.out.println("Gửi email tới " + to + " qua SMTP");
        return true;
    }
}