package model;

public class DVDInfantil extends DVD {

    public DVDInfantil(String titulo) {
        super(titulo);
    }

    @Override
    public double calcularPreco(int diasAlugados) {
        double valorCorrente = 0.0;

        valorCorrente += 1.5; // Custo inicial de R$ 1.50 por 3 dias

        if (diasAlugados > 3) {
            valorCorrente += (diasAlugados - 3) * 1.5; // Cada dia adicional acrescenta R$ 1.50
        }

        return valorCorrente;
    }
}