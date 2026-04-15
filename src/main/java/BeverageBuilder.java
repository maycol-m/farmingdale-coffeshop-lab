public interface BeverageBuilder {
    BeverageBuilder setSize(String size);
    BeverageBuilder setMilk(String milk);
    BeverageBuilder setShots(int shots); // only valid for espresso drinks
    BeverageBuilder setSweetener(String sweetener);
    Beverage build();
}