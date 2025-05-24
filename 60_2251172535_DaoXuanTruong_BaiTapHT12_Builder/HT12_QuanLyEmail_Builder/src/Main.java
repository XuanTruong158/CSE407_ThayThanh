public class Main {
    public static void main(String[] args) {
        // Sử dụng SMTP
        IEmailNotifierBuilder smtpBuilder = new SmtpNotifierBuilder();
        Director director = new Director(smtpBuilder);
        director.make();
        EmailNotifier a = smtpBuilder.getNotifier();

        a.notify("user@example.com", "Chào bạn!");
        a.notify("", "Chào bạn!");

        // Sử dụng API
        IEmailNotifierBuilder apiBuilder = new ApiNotifierBuilder();
        director.changeBuilder(apiBuilder);
        director.make();
        EmailNotifier b = apiBuilder.getNotifier();

        b.notify("2251172535@example.com", "Chào bạn!");
        b.notify("", "Chào bạn!");
        b.notify("           ", "Chào bạn!");
    }
}
