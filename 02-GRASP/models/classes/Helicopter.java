package models.classes;

public class Helicopter extends AirVehicle {
    private int quantityRotors;

    public Helicopter(String identification, double purchasePrice, double flightTime, int quantityRotors) {
        super(identification, purchasePrice, flightTime);
        this.quantityRotors = quantityRotors;
    }

    public int getQuantityRotors() {
        return quantityRotors;
    }

    public void setQuantityRotors(int quantityRotors) {
        this.quantityRotors = quantityRotors;
    }
}
