package model;

public class MediaAdapter implements AudioPlayer {
    private VideoPlayer videoPlayer;

    public MediaAdapter(String audioType) {
        if ("MP4".equalsIgnoreCase(audioType)) {
            videoPlayer = new MP4Player();
        } else if ("MKV".equalsIgnoreCase(audioType)) {
            videoPlayer = new MKVPlayer();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if ("MP4".equalsIgnoreCase(audioType)) {
            videoPlayer.playMP4(filename);
        } else if ("MKV".equalsIgnoreCase(audioType)) {
            videoPlayer.playMKV(filename);
        }
    }
}

