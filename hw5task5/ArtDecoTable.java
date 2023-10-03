package hw5task5;

public class ArtDecoTable implements Table {
    private final String info = "Art-Deco Table";
    private final double price = 3500;

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
        return "Table: " + info + ", " + price + " uah";
    }
}
