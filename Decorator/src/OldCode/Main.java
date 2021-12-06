package OldCode;

public class Main {
    public static void main(String[] args) {

        VanillaIceCream VanIceCream = new VanillaIceCream();
        System.out.println(VanIceCream.getDescription() + " €" + VanIceCream.getCost());

        ChocolateIceCream ChocoIceCream = new ChocolateIceCream();
        System.out.println(ChocoIceCream.getDescription() + " €" + ChocoIceCream.getCost());
    }
}