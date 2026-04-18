public class HotBeverageFactory implements BeverageFactory {
    @Override
    public Beverage createCoffee() {
        return new Coffee("Hot");
    }

    @Override
    public Beverage createLatte() {
        return new Latte("Hot");
    }

    @Override
    public Beverage createCappuccino() {
        return new Cappuccino("Hot");
    }

    @Override
    public Beverage createTea() {
        return new Tea("Hot");
    }
}
