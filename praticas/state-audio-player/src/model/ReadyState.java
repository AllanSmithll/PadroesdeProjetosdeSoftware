package model;

public class ReadyState implements PlayerState {
    @Override
    public void play(Player player) {
        player.setState(new PlayingState());
        player.startPlayback();
    }

    @Override
    public void stop(Player player) {
        player.setState(new LockedState());
        System.out.println("Player agora está parado.");
    }

    @Override
    public void next(Player player) {}
    @Override
    public void prev(Player player) {}
}