public class ConcreteBeverageBuilder implements BeverageBuilder {
    private final Beverage beverage;

    public ConcreteBeverageBuilder(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BeverageBuilder setSize(String size) {
        beverage.size = size;
        return this;
    }
    @Override
    public BeverageBuilder setMilk(String milk) {
        beverage.milk = milk;
        return this;
    }

    // Sets espresso shot count, tea ignores shots; a warning is printed if attempted
    @Override
    public BeverageBuilder setShots(int shots) {
        if (beverage instanceof Tea) {
            System.out.println("[Warning] Tea does not take espresso shots. Skipping.");
        } else {
            beverage.shots = shots;
        }
        return this;
    }

    @Override
    public BeverageBuilder setSweetener(String sweetener) {
        beverage.sweetener = sweetener;
        return this;
    }

    // Returns the fully configured Beverage
    @Override
    public Beverage build() {
        return beverage;
    }
}