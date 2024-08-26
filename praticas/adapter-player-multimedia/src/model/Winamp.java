package model;

public class Winamp {
    private final AudioPlayer audioPlayer;

    public Winamp(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void playAudio(String audioType, String filename) {
        if ("MP3".equalsIgnoreCase(audioType)) {
            audioPlayer.play(audioType, filename);
        } else if ("MP4".equalsIgnoreCase(audioType) || "MKV".equalsIgnoreCase(audioType)) {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        } else {
            System.out.println("Formato de áudio não suportado.");
        }
    }

    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();
        Winamp winamp = new Winamp(mp3Player);

        winamp.playAudio("MP3", "musica.mp3");
        winamp.playAudio("MP4", "video.mp4");
        winamp.playAudio("MKV", "filme.mkv");
    }
}
