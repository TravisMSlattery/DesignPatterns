package MyDemoCode;

public class VanillaIceCream extends IceCreamDecorator{
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
        description = "Extra Scoop of Vanilla";
    }




    @Override
    public double getCost() {
        return  tempIceCream.getCost() + Price.VANILLA_PRICE.price;
    }
}
