package model;

public class MP4Player implements VideoPlayer {
    @Override
    public void playMKV(String filename) {
        System.out.println("MP4Player não pode reproduzir arquivos MKV.");
    }

    @Override
    public void playMP4(String filename) {
        System.out.println("Reproduzindo arquivo MP4: " + filename);
    }
}

