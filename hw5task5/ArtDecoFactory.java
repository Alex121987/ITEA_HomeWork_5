package hw5task5;

public class ArtDecoFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }
    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }
    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
    @Override
    public Shelf createShelf() { return new ArtDecoShelf(); }
}
