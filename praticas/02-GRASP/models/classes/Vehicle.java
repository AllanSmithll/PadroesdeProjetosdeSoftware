package models.classes;

public abstract class Vehicle {
    private final String identification;
    private double purchasePrice;

    public Vehicle(String identification, double purchasePrice) {
        this.identification = identification;
        this.purchasePrice = purchasePrice;
    }

    public String getIdentification() {
        return identification;
    }

    public double getPurchasePrice() {
        return this.purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    abstract public double getDiaryRate();
}