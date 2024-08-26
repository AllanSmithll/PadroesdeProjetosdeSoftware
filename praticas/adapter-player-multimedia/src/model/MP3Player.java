package model;

public class MP3Player implements AudioPlayer {
    @Override
    public void play(String audioType, String filename) {
        if ("MP3".equalsIgnoreCase(audioType)) {
            System.out.println("Reproduzindo arquivo MP3: " + filename);
        } else {
            System.out.println("MP3Player não suporta este tipo de áudio: " + audioType);
        }
    }
}
