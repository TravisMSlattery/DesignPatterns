package MyDemoCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);

    }
    @Override
    public List<String> getAddons() {
        List<String> list = new ArrayList<>(tempIceCream.getAddons());
        list.add("Scoop of Mint");
        return Collections.unmodifiableList(list);
    }


    @Override
    public double getCost() {

        return  tempIceCream.getCost() + Price.mintPrice.price;
    }
}
