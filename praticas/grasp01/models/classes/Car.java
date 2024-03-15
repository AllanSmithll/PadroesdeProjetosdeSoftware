package models.classes;

public class Car extends LandVehicle {
    private double range;

    public Car(String identification, double purchasePrice, String motor, String plate, double range) {
        super(identification, purchasePrice, motor, plate);
        this.range = range;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    @Override
    public double getDiaryRate() {
        return 0.02 * this.getPurchasePrice();
    }
}
