package model;

public class DVDLancamento extends DVD {

    private final double precoAluguel = 3;


    public DVDLancamento(String titulo) {
        super(titulo);
        this.setEhBonus(true);
    }

    @Override
    public double calcularPreco(int diasAlugados) {
        return diasAlugados * precoAluguel;
    }
}
