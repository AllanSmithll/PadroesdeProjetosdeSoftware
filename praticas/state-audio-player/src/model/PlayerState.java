package model;

public interface PlayerState {
    void play(Player player);
    void stop(Player player);
    void next(Player player);
    void prev(Player player);
}
