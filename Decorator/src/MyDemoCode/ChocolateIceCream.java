package MyDemoCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChocolateIceCream extends IceCreamDecorator {


    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public List<String> getAddons() {
        List<String> list = new ArrayList<>(tempIceCream.getAddons());
        list.add("Scoop of Chocolate");
        return Collections.unmodifiableList(list);
    }


    @Override
    public double getCost() {

        return  tempIceCream.getCost() + Price.chocolatePrice.price;
    }


}


