package model;

public class MKVPlayer implements VideoPlayer {
    @Override
    public void playMKV(String filename) {
        System.out.println("Reproduzindo arquivo MKV: " + filename);
    }

    @Override
    public void playMP4(String filename) {
        System.out.println("MKVPlayer não pode reproduzir arquivos MP4.");
    }
}

