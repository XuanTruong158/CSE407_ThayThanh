package ht12_bridge;

public interface IEmailService {
    boolean sendEmail(String to, String subject, String body);
    boolean deleteEmail(String email);
    boolean editEmail(String email, String newEmail);
}
