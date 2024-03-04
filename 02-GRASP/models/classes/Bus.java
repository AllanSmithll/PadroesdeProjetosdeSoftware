package models.classes;

import models.interfaces.Veicule;

public class Bus implements Veicule {
    private final String identification;
    private Motor motor;
    private String plate;
    private int numberPassengers;
    private double purchasePrice;

    // Construtor
    public Bus(String identification, Motor motor, String plate, int numberPassengers, double purchasePrice) {
        this.identification = identification;
        this.motor = motor;
        this.plate = plate;
        this.numberPassengers = numberPassengers;
        this.purchasePrice = purchasePrice;
    }

    @Override
    public String getIdentification() {
        return this.identification;
    }

    @Override
    public double getPurchasePrice() {
        return this.purchasePrice;
    }
}
