package model;

public class DVDInfantil extends DVD {

    public DVDInfantil(String titulo) {
        super(titulo);
    }

    @Override
    public double calcularPreco(int diasAlugados) {
        double valorCorrente = 0.0;
        valorCorrente += 1.5;
        if (diasAlugados > 3) {
            valorCorrente += (diasAlugados - 3) * 1.5;
        }
        return valorCorrente;
    }
}