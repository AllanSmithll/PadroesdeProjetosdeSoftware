package models.classes;

import models.enums.StartingSystem;

public class Bus extends LandVehicle {
    private int numberPassengers;

    public Bus(String identification, double purchasePrice, String motor, String plate, int numberPassengers) {
        super(identification, purchasePrice, motor, plate);
        this.numberPassengers = numberPassengers;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    @Override
    public double getDiaryRate() {
        return (0.04 * this.getPurchasePrice()) + (100 * this.numberPassengers);
    }
}
