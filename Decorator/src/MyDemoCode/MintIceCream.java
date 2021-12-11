package MyDemoCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MintIceCream extends IceCreamDecorator {

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
        description = "Scoop of Mint";

    }
    @Override
    public double getCost() {

        return  tempIceCream.getCost() + Price.MINT_PRICE.price;
    }
}
