public abstract class Beverage {
    protected String type;
    protected String temperature; // "Hot" or "Iced"
    protected String size;
    protected String milk;
    protected int shots; // 0 means no espresso shots (e.g., Tea)
    protected String sweetener;

    public String getType() {
        return type;
    }
    public String getTemperature() {
        return temperature;
    }
    public String getSize() {
        return size;
    }
    public String getMilk() {
        return milk;
    }
    public int    getShots() {
        return shots;
    }
    public String getSweetener() {
        return sweetener;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(temperature).append(" ").append(type);
        if (size != null) sb.append(" | Size: ").append(size);
        if (milk != null) sb.append(" | Milk: ").append(milk);
        if (shots > 0) sb.append(" | Shots: ").append(shots);
        if (sweetener != null) sb.append(" | Sweetener: ").append(sweetener);
        return sb.toString();
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
