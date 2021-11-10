package MyDemoCode;

public class ChocolateIceCream extends IceCreamDecorator {


    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double getCost() {
        System.out.println("Adding a scoop of Chocolate Ice-Cream!");
        return 1.0 + super.getCost();

    }


}


