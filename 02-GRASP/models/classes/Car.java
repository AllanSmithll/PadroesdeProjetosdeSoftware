package models.classes;

import models.interfaces.Veicule;

public class Car implements Veicule {
    private final String identification;
    private double range;
    private Motor motor;
    private String plate;
    private double purchasePrice;


    public Car(String identification, double range, Motor motor, String plate, double purchasePrice) {
        this.identification = identification;
        this.range = range;
        this.motor = motor;
        this.plate = plate;
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

    @Override
    public double calculateDiary() {
        return 0.02 * this.purchasePrice;
    }
}