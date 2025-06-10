package ht12_strategy;

public class EmailContext {
    private IEmailStrategy strategy;

    public void setStrategy(IEmailStrategy strategy) {
        this.strategy = strategy;
    }

    public void sendEmail(String message) {
        if (strategy != null) {
            strategy.send(message);
        } else {
            System.out.println("Vui lòng chọn chiến lược gửi email trước.");
        }
    }
}
