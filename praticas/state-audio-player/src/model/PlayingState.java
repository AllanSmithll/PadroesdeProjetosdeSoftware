package model;

public class PlayingState implements PlayerState {
    @Override
    public void play(Player player) {
        player.setState(new ReadyState());
        player.setPlaying(false);
        System.out.println("Playback pausado.");
    }

    @Override
    public void stop(Player player) {
        player.setState(new LockedState());
        player.setPlaying(false);
        System.out.println("Playback parado e player está bloqueado.");
    }

    @Override
    public void next(Player player) {
        String nextTrack = player.nextTrack();
        System.out.println("Tocando próxima música: " + nextTrack);
    }

    @Override
    public void prev(Player player) {
        String prevTrack = player.previousTrack();
        System.out.println("Tocando música anterior: " + prevTrack);
    }
}
