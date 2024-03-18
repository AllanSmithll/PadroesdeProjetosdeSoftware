package model;

public class Aluguel {
    private DVD dvd;
    private int diasAlugado;
    public Aluguel(DVD dvd, int diasAlugado) {
        this.dvd = dvd;
        this.diasAlugado = diasAlugado;
    }
    public DVD getDVD() {
        return dvd;
    }
    public int getDiasAlugado() {
        return diasAlugado;
    }

    public double calcularValor() { return dvd.calcularPreco() * diasAlugado; }
}