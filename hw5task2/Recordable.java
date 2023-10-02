package hw5task2;

public interface Recordable {
    default void record() {
        System.out.println("Player starts recording.");
    }
    void pause();
    void stop();
}
