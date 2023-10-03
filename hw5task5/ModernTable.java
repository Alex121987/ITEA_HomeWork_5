package hw5task5;

public class ModernTable implements Table {
    private final String info = "Modern Table";
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
        return "Table: " + info + ", " + price + " uah";
    }
}
