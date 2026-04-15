public interface BeverageBuilder {
    BeverageBuilder setSize(String size);
    BeverageBuilder setMilk(String milk);
    BeverageBuilder setShots(int shots);
    BeverageBuilder setSweetener(String sweetener);
    Beverage build();
}