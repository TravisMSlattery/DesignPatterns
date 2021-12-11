package MyDemoCode;

public enum Price {
    VANILLA_PRICE(1.0), MINT_PRICE(1.5), SINGLE_SCOOP(0.5), CHOCOLATE_PRICE(2.0), TOPPINGS_PRICE(0.5);
    double price;

    Price(double price) { this.price = price; }

}
