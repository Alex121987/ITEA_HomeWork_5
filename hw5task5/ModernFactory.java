package hw5task5;

public class ModernFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
    @Override
    public Table createTable() {
        return new ModernTable();
    }
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
    @Override
    public Shelf createShelf() { return new ModernShelf(); }
}
