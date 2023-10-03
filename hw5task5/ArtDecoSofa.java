package hw5task5;

public class ArtDecoSofa implements Sofa {
    private final String info = "Art-Deco Sofa";
    private final double price = 4500;

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
