package hw5task2;

public interface Playable {
    default void play() {
        System.out.println("Player starts playing.");
    }
    void pause();
    void stop();
}
