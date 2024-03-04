package models.classes;

import models.enums.StartingSystem;
import models.interfaces.Veicule;

public class Motocycle implements Veicule {
    private final String identification;
    private Motor motor;
    private String placa;
    private StartingSystem startingSystem;
    private double valorDeCompra;

    // Construtor
    public Motocycle(String identification, Motor motor, String placa, StartingSystem startingSystem, double valorDeCompra) {
        this.identification = identification;
        this.motor = motor;
        this.placa = placa;
        this.startingSystem = startingSystem;
        this.valorDeCompra = valorDeCompra;
    }

    @Override
    public String getIdentification() {
        return null;
    }

    @Override
    public double getPurchasePrice() {
        return 0;
    }

    // Métodos getters e setters para os atributos da classe Moto...
}