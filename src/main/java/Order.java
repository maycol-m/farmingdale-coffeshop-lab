import java.util.ArrayList;
import java.util.List;

public class Order {

    public enum ServiceType {
        DINE_IN,
        TAKEOUT,
        MOBILE_PICKUP
    }

    private String customerName;
    private ServiceType serviceType;
    private List<Beverage> beverages;

    public Order(String customerName, ServiceType serviceType) {
        this.customerName = customerName;
        this.serviceType = serviceType;
        this.beverages = new ArrayList<>();
    }

    public void addItem(Beverage beverage) {
        beverages.add(beverage);
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }

    public void printReceipt() {
        System.out.println("=== Receipt ===");
        System.out.println("Customer: " + customerName);
        System.out.println("Service Type: " + serviceType);
        for (int i = 0; i < beverages.size(); i++) {
            System.out.println((i + 1) + ". " + beverages.get(i).getDescription());
        }
        System.out.println("Total items: " + beverages.size());
    }
}