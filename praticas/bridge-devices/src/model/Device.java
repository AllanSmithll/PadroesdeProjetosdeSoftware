package model;

public abstract class Device {
    protected boolean on = false;
    protected int volume = 0;
    protected int channel = 1;

    public boolean isEnabled() {
        return on;
    }

    public void enable() {
        on = true;
    }

    public void disable() {
        on = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int percent) {
        if (percent >= 0 && percent <= 100) {
            volume = percent;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Device [isEnabled=" + on + ", volume=" + volume + ", channel=" + channel + "]";
    }

    public void printStatus() {
        System.out.println(toString());
    }
}
