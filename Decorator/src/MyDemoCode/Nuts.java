package MyDemoCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class Nuts extends ToppingsDecorator {
    public Nuts(IceCream iceCream) {
        super(iceCream);
        description = "Nuts";

    }


    @Override
    public double getCost() {

        return  tempIceCream.getCost() + Price.TOPPINGS_PRICE.price;
    }
}