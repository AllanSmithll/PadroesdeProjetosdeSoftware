package model;

public class TV extends Device {
    private boolean smartv;

    public void smartvOn() {smartv = true;}
    public void smartvOff() { smartv = false;}

    @Override
    public void printStatus() {
        super.printStatus();
    }
}
