package MyDemoCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Nuts extends ToppingsDecorator {
    public Nuts(IceCream iceCream) {
        super(iceCream);

    }
    @Override
    public List<String> getAddons() {
        List<String> list = new ArrayList<>(tempIceCream.getAddons());
        list.add("Nuts");
        return Collections.unmodifiableList(list);
    }


    @Override
    public double getCost() {

        return  tempIceCream.getCost() + Price.toppingsPrice.price;
    }
}