package MyDemoCode;

import OldCode.ChocolateIceCream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicIceCream implements IceCream {


    @Override
    public List<String> getAddons() {
        List<String> list = new ArrayList<>();
        list.add("Single Scoop Ice-Cream in a bowl");
        return Collections.unmodifiableList(list);
    }

    @Override
    public String getDescription(ChocolateIceCream chocolateIceCream) {
        return "Creating a single scoop Ice-Cream in a bowl";
    }

    @Override
    public double getCost() {
        return Price.singleScoop.price;
    }
}