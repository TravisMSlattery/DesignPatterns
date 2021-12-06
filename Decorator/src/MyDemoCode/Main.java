package MyDemoCode;

public class Main {

    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println(basicIceCream.getDescription(new OldCode.ChocolateIceCream()) + " €" + basicIceCream.getCost());

        basicIceCream = new VanillaIceCream(basicIceCream);
        System.out.println(basicIceCream.getDescription(new OldCode.ChocolateIceCream()) + " €" + basicIceCream.getCost());

        IceCream basicIceCream2 = new BasicIceCream();
        basicIceCream2 = new ChocolateIceCream(new MintIceCream(new VanillaIceCream(basicIceCream2)));
        System.out.println(basicIceCream2.getDescription(new OldCode.ChocolateIceCream()) + " €" + basicIceCream2.getCost());

        IceCream IceCreamCone = new IceCreamCone();
        IceCreamCone = new Sprinkles(new MintIceCream(new ChocolateIceCream(IceCreamCone)));
        System.out.println(IceCreamCone.getDescription(new OldCode.ChocolateIceCream()) + " €" + basicIceCream2.getCost());



    }
}
