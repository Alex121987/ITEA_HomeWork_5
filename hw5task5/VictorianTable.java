package hw5task5;

public class VictorianTable implements Table {
    private final String info = "Victorian Table";
    private final double price = 6000;

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
