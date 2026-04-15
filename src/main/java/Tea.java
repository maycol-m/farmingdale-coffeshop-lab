public class Tea extends Beverage{
    Tea(String temperature) {
        // Tea doesn't take espresso shots (==0)
        this.type = "Tea";
        this.temperature = temperature;
    }
}
