public class ShoppingAssistant {
    private int orderId;
    private int eventId;

    public ShoppingAssistant(int orderId, int eventId) {
        this.orderId = orderId;
        this.eventId = eventId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void assistShopping() {
        System.out.println("=== Shopping Assistant ===");
        System.out.println("Assisting with shopping. Order ID: " + orderId + ", Event ID: " + eventId);
        System.out.println("==========================\n");
    }

    public void provideRecommendations() {
        System.out.println("=== Shopping Assistant ===");
        System.out.println("Providing personalized recommendations for Order ID: " + orderId);
        System.out.println("==========================\n");
    }
}