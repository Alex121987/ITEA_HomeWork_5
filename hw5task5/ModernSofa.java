package hw5task5;

public class ModernSofa implements Sofa {
    private final String info = "Modern Sofa";
    private final double price = 5500;

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
