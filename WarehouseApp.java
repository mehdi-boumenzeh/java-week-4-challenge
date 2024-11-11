import java.util.*;
public class WarehouseApp {
    public static void main(String[] args) {
        WarehouseInventorySystem warehouse = new WarehouseInventorySystem();

        // Adding products
        warehouse.addProduct("101", "Apple", 50);
        warehouse.addProduct("102", "Banana", 30);
        warehouse.addProduct("103", "Cherry", 75);

        // Looking up a product
        warehouse.lookupProduct("102");

        // Sorting and printing products by name
        warehouse.sortProductsByName();

        // Recording daily shipments
        warehouse.recordDailyShipment(Arrays.asList("101", "103"));
        warehouse.recordDailyShipment(Arrays.asList("102", "101"));

        // Printing a specific daily shipment
        warehouse.printDailyShipment(0);
        warehouse.printDailyShipment(1);
    }
}