package MyDemoCode;

import OldCode.ChocolateIceCream;

import java.util.Collections;
import java.util.List;

public abstract class ToppingsDecorator implements IceCream {

    protected IceCream tempIceCream;

    public List<String> getAddons() {
        return Collections.emptyList();
    }


    public String getDescription(ChocolateIceCream chocolateIceCream) {
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