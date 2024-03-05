package models.classes;

import models.enums.StartingSystem;

public class Motocycle extends LandVehicle {
    private StartingSystem startingSystem;

    public Motocycle(String identification, double purchasePrice, String motor, String plate, StartingSystem startingSystem) {
        super(identification, purchasePrice, motor, plate);
        this.startingSystem = startingSystem;
    }

    public StartingSystem getStartingSystem() {
        return startingSystem;
    }

    public void setStartingSystem(StartingSystem startingSystem) {
        this.startingSystem = startingSystem;
    }

    @Override
    public double getDiaryRate() {
        if(this.startingSystem.equals(StartingSystem.ELECTRIC)) {
            return (0.02 * this.getPurchasePrice()) + 20.0;
        }
        return (0.02 * this.getPurchasePrice()) + 5.0;
    }
}