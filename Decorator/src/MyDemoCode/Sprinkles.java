package MyDemoCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class Sprinkles extends ToppingsDecorator {
    public Sprinkles(IceCream iceCream) {
        super(iceCream);
        description = "Sprinkles";
    }


    @Override
    public double getCost() {

        return  tempIceCream.getCost() + Price.TOPPINGS_PRICE.price;
    }
}