package model;

public class ExtratoHTML extends Extrato {

    public ExtratoHTML(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String getCabecalho(String nomeCliente) {
        String s = "<H1>Registro de Alugueis de <EM>" +
                nomeCliente + "</EM></H1><P>" + this.getSeparadorDeLinha();
        return s;
    }

    @Override
    protected String getSeparadorDeLinha() {
        return System.getProperty("line.separator");
    }

    @Override
    protected String formatarAluguel(String tituloDVD, double valor) {
        String s = tituloDVD + ": R$ " + valor + "<BR>" + this.getSeparadorDeLinha();
        return s;
    }

    @Override
    protected String getRodape(double valorTotal, int pontosTotais) {
        String s = "<P>Valor total pago: <EM>R$ " + valorTotal +
                "</EM>" + this.getSeparadorDeLinha();
        s += "<P>Voce acumulou <EM>" + pontosTotais + " pontos </EM> de alugador frequente";
        return s;
    }
}