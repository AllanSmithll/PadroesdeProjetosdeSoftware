package model;

public class LockedState implements PlayerState {
    @Override
    public void play(Player player) {
        player.setState(new ReadyState());
        System.out.println("Player está pronto agora.");
    }

    @Override
    public void stop(Player player) {
        if (player.isPlaying()) {
            player.setState(new ReadyState());
            player.setPlaying(false);
            System.out.println("Playback parado e player está pronto agora.");
        } else {
            System.out.println("Player está bloqueado.");
        }
    }

    @Override
    public void next(Player player) {}
    @Override
    public void prev(Player player) {}
}
