public class ApiEmailService implements IEmailService {
    @Override
    public boolean SendEmail(String to, String subject, String body) {
        if (to != null && (!to.trim().isEmpty())) {
            System.out.println("Gửi email tới [" + to + "] thành công qua API");
            return true;
        } else {
            System.out.println("Địa chỉ email không hợp lệ");
            return false;
        }
    }
}
