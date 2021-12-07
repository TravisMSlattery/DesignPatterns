package MyDemoCode;

public class Main {

    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println(basicIceCream.getDescription() + " €" + basicIceCream.getCost());

       basicIceCream = new VanillaIceCream(basicIceCream);
        System.out.println(basicIceCream.getDescription() + " €" + basicIceCream.getCost());

        IceCream basicIceCream2 = new BasicIceCream();
        basicIceCream2 = new Nuts(new ChocolateIceCream(new MintIceCream(new VanillaIceCream(basicIceCream2))));
        System.out.println(basicIceCream2.getDescription() + " €" + basicIceCream2.getCost());

        IceCream IceCreamCone = new IceCreamCone();
        IceCreamCone = new Sprinkles(new MintIceCream(new ChocolateIceCream(IceCreamCone)));
        System.out.println(IceCreamCone.getDescription() + " €" + IceCreamCone.getCost());


    }
}
