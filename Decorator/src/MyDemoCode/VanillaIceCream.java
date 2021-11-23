package MyDemoCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class VanillaIceCream extends IceCreamDecorator{
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public List<String> getAddons() {
        List<String> list = new ArrayList<>(tempIceCream.getAddons());
        list.add("Scoop of Vanilla");
        return Collections.unmodifiableList(list);
    }


    @Override
    public double getCost() {
        return  tempIceCream.getCost() + Price.vanillaPrice.price;
    }
}
