package hw5task5;

public class ModernShelf implements Shelf {
    private final String info = "Modern Shelf";
    private final double price = 1000;

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
        return "Shelf: " + info + ", " + price + " uah";
    }
}
