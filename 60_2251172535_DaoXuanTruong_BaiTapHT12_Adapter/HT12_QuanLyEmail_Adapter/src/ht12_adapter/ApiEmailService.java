package ht12_adapter;

class ApiEmailService {
    public boolean SendViaApi(String to, String subject, String body) {
        if (to == null || to.trim().isEmpty()) {
            System.out.println("Địa chỉ email không hợp lệ (API)");
            return false;
        }
        System.out.println("Gửi email tới " + to + " qua API");
        return true;
    }
}