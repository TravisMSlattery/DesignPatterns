package MyDemoCode;

import OldCode.ChocolateIceCream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ToppingsDecorator implements IceCream {

    protected IceCream tempIceCream;
    protected String description;

    public List<String> getAddons() {
        List<String> list = new ArrayList<>(tempIceCream.getAddons());
        list.add(description);
        return Collections.unmodifiableList(list);
    }


    public String getDescription() {
        StringBuilder description = new StringBuilder();
        String separator = "";
        for (String s : getAddons()) {
            description.append(separator).append(s);
            separator = ", ";
        }
        description.append(":");
        return description.toString();
    }
    public ToppingsDecorator(IceCream iceCream) {

        tempIceCream = iceCream;
    }

//    @Override
//    public String getDescription() {
//        return tempIceCream.getDescription();
//    }

    @Override
    public double getCost() {
        return tempIceCream.getCost();
    }
}