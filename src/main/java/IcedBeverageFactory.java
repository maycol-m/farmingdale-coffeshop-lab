public class IcedBeverageFactory implements BeverageFactory {
    @Override
    public Beverage createCoffee() {
        return new Coffee("Iced");
    }

    @Override
    public Beverage createLatte() {
        return new Latte("Iced");
    }

    @Override
    public Beverage createCappuccino() {
        return new Cappuccino("Iced");
    }

    @Override
    public Beverage createTea() {
        return new Tea("Iced");
    }
}
