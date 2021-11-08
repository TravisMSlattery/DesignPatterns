package HeadFirstCode;

public abstract class AddonDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}