import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.HashMap;

class WarehouseInventorySystem {
    private HashMap <String, Product> inventory; 
    private List<List<String>> dailyShipments; 

    public WarehouseInventorySystem() {
        inventory = new HashMap<>();
        dailyShipments = new ArrayList<>();
    }

    public void addProduct(String id, String name, int quantity) {
        if (!inventory.containsKey(id)) {
            Product product = new Product(id, name, quantity);
            inventory.put(id, product);
            System.out.println("Product added: " + product);
        } else {
            System.out.println("Product ID already exists. Cannot add product.");
        }
    }


    public void lookupProduct(String id) {
        Product product = inventory.get(id);
        if (product != null) {
            System.out.println("Product found: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void sortProductsByName() {
        List<Product> productList = new ArrayList<>(inventory.values());
        productList.sort(Comparator.comparing(Product::getName));

        System.out.println("Products sorted by name:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }


    public void recordDailyShipment(List<String> productIds) {
        dailyShipments.add(new ArrayList<>(productIds));
        System.out.println("Daily shipment recorded: " + productIds);
    }

    
    public void printDailyShipment(int dayIndex) {
        if (dayIndex >= 0 && dayIndex < dailyShipments.size()) {
            List<String> shipment = dailyShipments.get(dayIndex);
            System.out.println("Products in shipment for day " + (dayIndex + 1) + ": " + shipment);
        } else {
            System.out.println("Invalid day index.");
        }
    }
}
