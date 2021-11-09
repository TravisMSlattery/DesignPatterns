package MyDemoCode;

import java.util.ArrayList;
import java.util.List;

public class IceCreamDecorator implements IceCream {

    private IceCream iceCream;

    List<IceCream> iceCreamList = new ArrayList();

    public IceCreamDecorator(IceCream iceCream) {
        iceCreamList.add(iceCream);
    }

    @Override
    public double cost() {
        return this.iceCream.cost();
    }
}
