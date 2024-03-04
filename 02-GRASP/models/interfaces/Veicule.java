package models.interfaces;

public interface Veicule {
    String identification = "";
    double purchasePrice = 0.0;
    String getIdentification();
    double getPurchasePrice();
    double calculateDiary();
}