package hw5task2;

public class Player implements Playable, Recordable {

    @Override
    public void play() {
        System.out.println("Player starts playing.");
    }

    @Override
    public void pause() {
        System.out.println("Current action is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Current action is stopped.");
    }

    @Override
    public void record() {
        System.out.println("Player starts recording.");
    }
}
