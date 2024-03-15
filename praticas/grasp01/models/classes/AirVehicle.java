package models.classes;

public class AirVehicle extends Vehicle {
    private double flightTime;

    public AirVehicle(String identification, double purchasePrice, double flightTime) {
        super(identification, purchasePrice);
        this.flightTime = flightTime;
    }

    public double getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(double flightTime) {
        this.flightTime = flightTime;
    }

    @Override
    public double getDiaryRate() {
        return 0;
    }
}
