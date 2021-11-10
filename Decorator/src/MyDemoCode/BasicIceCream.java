package MyDemoCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicIceCream implements IceCream {


    @Override
    public List<String> getAddons() {
        List<String> list = new ArrayList<>();
        list.add("Basic Icecream");
        return Collections.unmodifiableList(list);
    }

    @Override
    public String getDescription() {
        return "Creating a single scoop IceCream";
    }

    @Override
    public double getCost() {
        return 0.50;
    }
}