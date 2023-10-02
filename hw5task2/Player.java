package hw5task2;

public class Player implements Playable, Recordable {

    @Override
    public void play() {
        Playable.super.play();
    }

    @Override
    public void record() {
        Recordable.super.record();
    }

    @Override
    public void pause() {
        System.out.println("Current action is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Current action is stopped.");
    }
}
