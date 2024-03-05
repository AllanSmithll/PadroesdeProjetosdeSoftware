package models.classes;

public class Plane extends AirVehicle {
    private double cruisingSpeed;

    public Plane(String identification, double purchasePrice, double flightTime, double cruisingSpeed) {
        super(identification, purchasePrice, flightTime);
        this.cruisingSpeed = cruisingSpeed;
    }

    public double getCruisingSpeed() {
        return cruisingSpeed;
    }

    public void setCruisingSpeed(double cruisingSpeed) {
        this.cruisingSpeed = cruisingSpeed;
    }

    public double getDiaryRate() {
        return (this.getPurchasePrice()*0.2)+(1000*this.cruisingSpeed);
    }
}
