//OrderDriver: main/test class for the Ram's Brew Order System
//Demonstrates: Abstract Factory: HotBeverageFactory / IcedBeverageFactory, Builder Pattern: ConcreteBeverageBuilder for step-by-step customization
//Order management: three service types (Dine-In, Takeout, Mobile Pickup)
public class OrderDriver {

    public static void main(String[] args) {

        // Factories
        BeverageFactory hotFactory  = new HotBeverageFactory();
        BeverageFactory icedFactory = new IcedBeverageFactory();

        // ORDER 1: Dine-In
        Order order1 = new Order("Murid", Order.ServiceType.DINE_IN);

        // Hot Latte: Large, Oat milk, 2 shots, Honey
        Beverage hotLatte = new ConcreteBeverageBuilder(hotFactory.createLatte())
                .setSize("Large")
                .setMilk("Oat")
                .setShots(2)
                .setSweetener("Honey")
                .build();
        order1.addItem(hotLatte);

        // Iced Coffee: Medium, Almond milk, 1 shot, Sugar
        Beverage icedCoffee = new ConcreteBeverageBuilder(icedFactory.createCoffee())
                .setSize("Medium")
                .setMilk("Almond")
                .setShots(1)
                .setSweetener("Sugar")
                .build();
        order1.addItem(icedCoffee);

        order1.printReceipt();

        // ORDER 2: Takeout
        Order order2 = new Order("Maycol", Order.ServiceType.TAKEOUT);

        // Hot Cappuccino: Small, Whole milk, 3 shots, Stevia
        Beverage hotCap = new ConcreteBeverageBuilder(hotFactory.createCappuccino())
                .setSize("Small")
                .setMilk("Whole")
                .setShots(3)
                .setSweetener("Stevia")
                .build();
        order2.addItem(hotCap);

        // Iced Tea: Large, Soy milk, None sweetener, (Tea ignores shots, BUILDER PRINTS WARNING)
        Beverage icedTea = new ConcreteBeverageBuilder(icedFactory.createTea())
                .setSize("Large")
                .setMilk("Soy")
                .setSweetener("None")
                .build();
        order2.addItem(icedTea);
        order2.printReceipt();

        // ORDER 3: Mobile Pickup
        Order order3 = new Order("John Doe", Order.ServiceType.MOBILE_PICKUP);

        // Hot Tea: Medium, Skim milk, None sweetener
        Beverage hotTea = new ConcreteBeverageBuilder(hotFactory.createTea())
                .setSize("Medium")
                .setMilk("Skim")
                .setSweetener("None")
                .build();
        order3.addItem(hotTea);

        // Iced Latte: Large, Oat milk, 2 shots, None sweetener
        Beverage icedLatte = new ConcreteBeverageBuilder(icedFactory.createLatte())
                .setSize("Large")
                .setMilk("Oat")
                .setShots(2)
                .setSweetener("None")
                .build();
        order3.addItem(icedLatte);
        order3.printReceipt();

        // Shot-on-Tea warning demo
        System.out.println("-- Shot-on-Tea guard demo ------------------");
        Beverage guardedTea = new ConcreteBeverageBuilder(hotFactory.createTea())
                .setSize("Small")
                .setShots(2)   // expresso triggers warning
                .setSweetener("Honey")
                .build();
        System.out.println("Result: " + guardedTea.getDescription());
    }
}