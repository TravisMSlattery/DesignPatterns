package MyDemoCode;

public class VanillaIceCream extends IceCreamDecorator{
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding a scoop of Vanilla Ice-Cream!");
        return 1.0 + super.cost();
    }
}
