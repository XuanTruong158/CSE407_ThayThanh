package ht12_af;

public interface IEmailService {
	boolean SendEmail(String to, String subject, String body);
}