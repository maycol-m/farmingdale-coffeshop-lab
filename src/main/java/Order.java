import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Beverage> beverages;

    public Order() {
        this.beverages = new ArrayList<>();
    }

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }

    public void printOrder() {
        System.out.println("=== Order Summary ===");
        for (int i = 0; i < beverages.size(); i++) {
            System.out.println((i + 1) + ". " + beverages.get(i).getDescription());
        }
        System.out.println("Total items: " + beverages.size());
    }
}
