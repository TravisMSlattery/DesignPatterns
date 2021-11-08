package MyDemoCode;

public abstract class Cocktail {
    String description = "Unknown Cocktail";

    public String getDescription() {
        return description;
    }

    public abstract double cost() {
        return 10.00;
    }
}