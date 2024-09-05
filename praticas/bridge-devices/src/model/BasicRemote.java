package model;

public class BasicRemote {
    protected final Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    public void power() {}

    public void volumeDown() {}

    public void volumeUp() {}

    public void channelDown() {}

    public void channelUp() {}
}
