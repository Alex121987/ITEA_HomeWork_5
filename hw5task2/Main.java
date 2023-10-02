package hw5task2;

/**
 * Створіть проєкт з класом Main.java.
 * Потрібно: Створіть 2 інтерфейси Playable та Recordable.
 * У кожному з інтерфейсів створіть по 3 методи
 * void play() / void pause() / void stop()
 * та void record() / void pause() / void stop() відповідно.
 * Створити похідний клас Player від базових інтерфейсів Playable та Recordable.
 * Написати програму, яка виконує програвання та запис.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.play();
        player.pause();
        player.play();
        player.stop();

        System.out.println();

        player.record();
        player.pause();
        player.record();
        player.stop();
    }
}
