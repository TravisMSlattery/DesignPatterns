package MyDemoCode;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding a scoop of Mint Ice-Cream!");
        return  1.50 + super.cost();
    }
}
