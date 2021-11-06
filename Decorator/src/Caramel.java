public class Caramel extends AddonDecorator {
    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}