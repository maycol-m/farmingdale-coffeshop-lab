public abstract class Beverage {
    protected String type;
    protected String size;
    protected String milk;
    protected int shots;
    protected String sweetener;

    public String getDescription() {
        return type + " | Size: " + size + " | Milk: " + milk + " | Shots: " + shots + " | Sweetener: " + sweetener;
    }
}