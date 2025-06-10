package ht12_strategy;

public class ApiEmailStrategy implements IEmailStrategy {
    @Override
    public void send(String message) {
        System.out.println("API Strategy: Đã gửi email với nội dung: " + message);
    }
}
