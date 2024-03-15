package models;
public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double autonomia;
    private double capacidade_tanque;
    private double combustivel_disponivel = 0.0;

    public Veiculo(String marca, String modelo, double autonomia,
                   double capacidade_tanque, double combustivel_disponivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.autonomia = autonomia;
        this.capacidade_tanque = capacidade_tanque;
        this.combustivel_disponivel = combustivel_disponivel;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getAutonomia() {
        return this.autonomia;
    }

    public double getCapacidadeTanque() {
        return this.capacidade_tanque;
    }

    public double getCombustivelDisponivel() {
        return this.combustivel_disponivel;
    }

    public void setCombustivelDisponivel(double combustivel_disponivel) {
        this.combustivel_disponivel = combustivel_disponivel;
    }
}