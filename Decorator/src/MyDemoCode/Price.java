package MyDemoCode;

public enum Price {
    vanillaPrice(1.0), mintPrice(1.5), singleScoop(0.5), chocolatePrice(2.0);
    double price;

    Price(double price) { this.price = price; }

}
