package hw5task5;

public class VictorianSofa implements Sofa {
    private final String info = "Victorian Sofa";
    private final double price = 7500;

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
        return "Sofa: " + info + ", " + price + " uah";
    }
}
