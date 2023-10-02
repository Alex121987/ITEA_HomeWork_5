package hw5task1;

/**
 * Створіть проєкт з класом Main.java.
 * Потрібно: Створити клас AbstractHandler. У тілі класу створити методи void open(), void create(),
 * void change(), void save(). Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового
 * класу AbstractHandler. Створити три екземпляри XMLHandler, TXTHandler, DOCHandler.
 * Методи мають мати інформацію що саме за хендлер виконує роботу.
 * Для прикладу:
 * …. xmlHandler= new XMLHandler();
 * xmlHandler.open();
 * В консолі буде
 * XMLHandler opens a document
 */

public class Main {
    public static void main(String[] args) {
        AbstractHandler xmlHandler = new XMLHandler();
        AbstractHandler txtHandler = new TXTHandler();
        AbstractHandler docHandler = new DOCHandler();

        xmlHandler.create();
        xmlHandler.open();
        xmlHandler.change();
        xmlHandler.save();

        System.out.println();

        txtHandler.create();
        txtHandler.open();
        txtHandler.change();
        txtHandler.save();

        System.out.println();

        docHandler.create();
        docHandler.open();
        docHandler.change();
        docHandler.save();
    }
}
