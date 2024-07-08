package model;

public class DVDNormal extends DVD {
    private final Double precoAluguel = 2.0;

    public DVDNormal(String titulo) {
        super(titulo);
    }

    @Override
    public double calcularPreco(int diasAlugados) {
        double valorAluguel = precoAluguel;
        if (diasAlugados > 2){
            valorAluguel  += (diasAlugados - 2) * 1.5;
        }
        return valorAluguel;
    }
}