package MyDemoCode;

public class Main {

    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println(basicIceCream.getDescription());

        basicIceCream = new VanillaIceCream(basicIceCream);
        System.out.println(basicIceCream.getDescription() + "::" + basicIceCream.getCost());



    }
}
