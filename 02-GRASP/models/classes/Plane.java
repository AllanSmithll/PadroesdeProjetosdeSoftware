package models.classes;

import models.interfaces.Veicule;

public class Plane implements Veicule {
    private final String identification;
    private double flightTime;
    private double purchasePrice;
    private double cruisingSpeed;


    public Plane(String identification, double flightTime, double purchasePrice, double cruisingSpeed) {
        this.identification = identification;
        this.flightTime = flightTime;
        this.purchasePrice = purchasePrice;
        this.cruisingSpeed = cruisingSpeed;
    }

    public double calculateDiary() {
        return (this.purchasePrice*0.2)+(1000*this.cruisingSpeed);
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
