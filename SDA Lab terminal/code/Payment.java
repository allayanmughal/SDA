public class Payment {
    private int paymentId;
    private int orderId;
    private String userInfo;

    public Payment(int paymentId, int orderId, String userInfo) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.userInfo = userInfo;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public void processPayment() {
        System.out.println("=== Payment ===");
        System.out.println("Processing payment for Order ID: " + orderId + " with Payment ID: " + paymentId);
        System.out.println("===============\n");
    }

    public void refundPayment() {
        System.out.println("=== Payment ===");
        System.out.println("Refunding payment for Payment ID: " + paymentId);
        System.out.println("===============\n");
    }

    public void generateReceipt() {
        System.out.println("=== Payment ===");
        System.out.println("Generating receipt for Payment ID: " + paymentId + " and Order ID: " + orderId);
        System.out.println("===============\n");
    }
}