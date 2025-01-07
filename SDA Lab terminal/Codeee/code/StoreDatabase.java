public class StoreDatabase {
    public void storeData(String data) {
        System.out.println("=== Store Database ===");
        System.out.println("Storing data: " + data);
        System.out.println("=======================\n");
    }

    public String fetchData(String key) {
        System.out.println("=== Store Database ===");
        System.out.println("Fetching data for key: " + key);
        System.out.println("=======================\n");
        return "Sample Data for " + key;
    }

    public void deleteData(String key) {
        System.out.println("=== Store Database ===");
        System.out.println("Deleting data for key: " + key);
        System.out.println("=======================\n");
    }

    public void updateData(String key, String newData) {
        System.out.println("=== Store Database ===");
        System.out.println("Updating data for key: " + key + " with new data: " + newData);
        System.out.println("=======================\n");
    }
}
