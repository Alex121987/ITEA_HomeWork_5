package hw5task5;

import java.util.Scanner;

public class Client {
    public void choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the set You want to buy: \n" +
                "1. Art-Deco\n" +
                "2. Victorian\n" +
                "3. Modern");

        int variant = scanner.nextInt();

        switch (variant) {
            case 1:
                AbstractFactory artDecoFactory = new ArtDecoFactory();
                Chair artDecoChair = artDecoFactory.createChair();
                Table artDecoTable = artDecoFactory.createTable();
                Sofa artDecoSofa = artDecoFactory.createSofa();
                System.out.println(artDecoChair + "\n" + artDecoTable + "\n" + artDecoSofa + "\n");
                System.out.println("Total price:" + " " + (artDecoChair.getPrice() + artDecoTable.getPrice() + artDecoSofa.getPrice()) + " uah");
                break;
            case 2:
                AbstractFactory victorianFactory = new VictorianFactory();
                Chair victorianChair = victorianFactory.createChair();
                Table victorianTable = victorianFactory.createTable();
                Sofa victorianSofa = victorianFactory.createSofa();
                System.out.println(victorianChair + "\n" + victorianTable + "\n" + victorianSofa + "\n");
                System.out.println("Total price:" + " " + (victorianChair.getPrice() + victorianTable.getPrice() + victorianSofa.getPrice()) + " uah");
                break;
            case 3:
                AbstractFactory modernFactory = new ModernFactory();
                Chair modernChair = modernFactory.createChair();
                Table modernTable = modernFactory.createTable();
                Sofa modernSofa = modernFactory.createSofa();
                System.out.println(modernChair + "\n" + modernTable + "\n" + modernSofa + "\n");
                System.out.println("Total price:" + " " + (modernChair.getPrice() + modernTable.getPrice() + modernSofa.getPrice()) + " uah");
                break;
            default:
                System.out.println("Enter correct choice!");
        }
        scanner.close();
    }
}
