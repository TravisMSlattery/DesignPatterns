package MyDemoCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicIceCream implements IceCream {


    @Override
    public List<String> getAddons() {
        List<String> list = new ArrayList<>();
        list.add("Single Scoop Ice-Cream");
        return Collections.unmodifiableList(list);
    }

    @Override
    public String getDescription() {
        return "Creating a single scoop Ice-Cream";
    }

    @Override
    public double getCost() {
        return Price.singleScoop.price;
    }
}