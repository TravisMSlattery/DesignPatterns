package MyDemoCode;

import OldCode.ChocolateIceCream;

import java.util.List;

public interface IceCream {
    List<String> getAddons();
    String getDescription(ChocolateIceCream chocolateIceCream);
    double getCost();
}
