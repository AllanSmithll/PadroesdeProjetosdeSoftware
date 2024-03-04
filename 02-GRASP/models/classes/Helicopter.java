package models.classes;

import models.interfaces.Veicule;

public class Helicopter implements Veicule {
    private final String identification;
    private int quantityRotors;
    private double flightTime;
    private double purchasePrice;

    public Helicopter(String identification, int quantityRotors, double flightTime, double purchasePrice) {
        this.identification = identification;
        this.quantityRotors = quantityRotors;
        this.flightTime = flightTime;
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

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
