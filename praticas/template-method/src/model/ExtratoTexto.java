package model;

public class ExtratoTexto extends Extrato {
    public ExtratoTexto(Cliente cliente) {
        super(cliente);
    }

    @Override
    protected String getCabecalho(String nomeCliente) {
        return "Registro de Alugueis de " + nomeCliente;
    }

    @Override
    protected String getSeparadorDeLinha() {
        return System.lineSeparator();
    }

    @Override
    protected String formatarAluguel(String dvdTitulo, double valor) {
        String s= "\t"+ dvdTitulo+"\t"+ valor + this.getSeparadorDeLinha();
        return s;
    }

    @Override
    protected String getRodape(double valorTotal, int pontosTotais) {
        String s="";
        s+="Valor total devido: "+valorTotal+this.getSeparadorDeLinha();
        s+="Voce acumulou "+pontosTotais+" pontos de alugador frequente";
        return s;
    }
}