package model;

public class DigitalRadio extends Radio {
    private String modulation;

    public String getModulation() {
        return modulation;
    }

    public void setModulation(String modulation) {
        this.modulation = modulation;
    }

    @Override
    public void printStatus() {
        super.printStatus();
    }
}
