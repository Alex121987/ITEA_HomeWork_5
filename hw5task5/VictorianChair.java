package hw5task5;

public class VictorianChair implements Chair {
    private final String info = "Victorian Chair";
    private final double price = 2500;

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
