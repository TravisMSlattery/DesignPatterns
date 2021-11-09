package MyDemoCode;

public class Main {

    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("First scoop of Ice-cream cost €" + basicIceCream.cost());

        //Add Vanilla to the order
        IceCream vanilla = new VanillaIceCream(basicIceCream); // wrapping vanilla
        System.out.println("Extra cost for Vanilla is: €" + vanilla.cost());


        //Add Mint to the order
        IceCream mint = new MintIceCream(vanilla); // wrapping mint
        System.out.println("Extra cost for Mint is: €" + mint.cost());


    }
}
