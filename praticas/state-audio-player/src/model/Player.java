package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private PlayerState state;
    private boolean playing;
    private List<String> playlist;
    private int currentTrack;

    public Player() {
        this.state = new ReadyState();
        this.playing = true;
        this.playlist = new ArrayList<>();
        this.currentTrack = 0;

        for (int i = 1; i <= 12; i++) {
            playlist.add("Faixa " + i);
        }
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public void startPlayback() {
        System.out.println("Tocando: " + playlist.get(currentTrack));
    }

    public String nextTrack() {
        currentTrack = (currentTrack + 1) % playlist.size();
        return playlist.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack = (currentTrack - 1 + playlist.size()) % playlist.size();
        return playlist.get(currentTrack);
    }

    public void play() {
        state.play(this);
    }

    public void stop() {
        state.stop(this);
    }

    public void next() {
        state.next(this);
    }

    public void prev() {
        state.prev(this);
    }
}