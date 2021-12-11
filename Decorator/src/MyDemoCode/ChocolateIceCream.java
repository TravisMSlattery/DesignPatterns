package MyDemoCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChocolateIceCream extends IceCreamDecorator {


    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
        description = "Scoop of Chocolate";
    }


    @Override
    public double getCost() {

        return  tempIceCream.getCost() + Price.CHOCOLATE_PRICE.price;
    }


}


