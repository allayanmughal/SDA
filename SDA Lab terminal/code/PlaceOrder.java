public class PlaceOrder {
    private int orderId;

    public PlaceOrder(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void makeOrder() {
        System.out.println("=== Place Order ===");
        System.out.println("Order placed successfully. Order ID: " + orderId);
        System.out.println("===================\n");
    }

    public void makePayment() {
        System.out.println("=== Place Order ===");
        System.out.println("Payment initiated for Order ID: " + orderId);
        System.out.println("===================\n");
    }

    public void cancelOrder() {
        System.out.println("=== Place Order ===");
        System.out.println("Order ID: " + orderId + " has been canceled.");
        System.out.println("===================\n");
    }

    public void updateOrderDetails(String details) {
        System.out.println("=== Place Order ===");
        System.out.println("Updating order details for Order ID: " + orderId + ". Details: " + details);
        System.out.println("===================\n");
    }
}