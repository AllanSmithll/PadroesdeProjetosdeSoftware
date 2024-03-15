package models.classes;

public abstract class LandVehicle extends Vehicle {
    private String motor;
    private String plate;

    public LandVehicle(String identification, double purchasePrice, String motor, String plate) {
        super(identification, purchasePrice);
        this.motor = motor;
        this.plate = plate;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public double getDiaryRate() {
        return 0;
    }
}
