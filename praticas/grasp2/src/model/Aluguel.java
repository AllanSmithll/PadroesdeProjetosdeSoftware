package model;

public class Aluguel {
    private DVD dvd;
    private int diasAlugados;
    public Aluguel(DVD dvd, int diasAlugado) {
        this.dvd = dvd;
        this.diasAlugados = diasAlugado;
    }
    public DVD getDVD() {
        return dvd;
    }
    public int getDiasAlugado() {
        return diasAlugados;
    }

    public boolean ehDVDBonus(){
        return this.dvd.ehBonus();
    }

    public double calcularValor() { return dvd.calcularPreco(this.diasAlugados); }
}