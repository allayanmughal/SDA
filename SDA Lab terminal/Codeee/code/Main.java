// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("========== Welcome to the Shopping Assistant System ==========\n");

        ShoppingAssistant assistant = new ShoppingAssistant(101, 202);
        assistant.assistShopping();
        assistant.provideRecommendations();

        PlaceOrder placeOrder = new PlaceOrder(101);
        placeOrder.makeOrder();
        placeOrder.updateOrderDetails("Updated delivery address.");
        placeOrder.makePayment();
        placeOrder.cancelOrder();

        Payment payment = new Payment(501, 101, "User123");
        payment.processPayment();
        payment.generateReceipt();
        payment.refundPayment();

        StoreDatabase database = new StoreDatabase();
        database.storeData("Order data for Order ID: 101");
        String fetchedData = database.fetchData("Order101");
        System.out.println("Fetched Data: " + fetchedData);
        database.updateData("Order101", "Updated Order Data");
        database.deleteData("Order101");

        System.out.println("========== Thank you for using the Shopping Assistant System ==========");
    }
}
