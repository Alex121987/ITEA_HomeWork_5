package hw5task5;

public class ArtDecoChair implements Chair {
    private final String info = "Art-Deco Chair";
    private final double price = 1500;

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Chair: " + info + ", " + price + " uah";
    }
}
