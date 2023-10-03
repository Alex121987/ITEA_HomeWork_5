package hw5task5;

public class VictorianFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
    @Override
    public Shelf createShelf() { return new VictorianShelf(); }
}
