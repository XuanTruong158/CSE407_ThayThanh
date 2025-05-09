package ht12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IEmailService ses = new SmtpEmailService();
        EmailNotifier a = new EmailNotifier(ses);
        a.Notify("user@example.com", "Chào bạn!");
        a.Notify("", "Chào bạn");

        IEmailService aes = new ApiEmailService();
        EmailNotifier b = new EmailNotifier(aes);
        b.Notify("", "Chào bạn!");
        b.Notify("2251172535@gmail.com", "Chào bạn!");
	}

}
