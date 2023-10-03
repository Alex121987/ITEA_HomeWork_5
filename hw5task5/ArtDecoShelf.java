package hw5task5;

public class ArtDecoShelf implements Shelf {
    private final String info = "Art-Deco Shelf";
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
        return "Shelf: " + info + ", " + price + " uah";
    }
}
