package hw5task5;

public class ModernChair implements Chair {
    private final String info = "Modern Chair";
    private final double price = 2000;

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
