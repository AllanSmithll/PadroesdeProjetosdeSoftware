package model;

public class ExtratoHTML extends Extrato {

    public ExtratoHTML(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String gerarExtrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        StringBuilder resultado = new StringBuilder("<H1>Registro de Alugueis de <EM>")
                .append(cliente.getNome()).append("</EM></H1><P>").append(fimDeLinha);
        for (Aluguel aluguel : cliente.getDvdsAlugados()) {
            resultado.append(aluguel.getDVD().getTitulo()).append(": R$ ")
                    .append(aluguel.calcularValor()).append("<BR>").append(fimDeLinha);
        }
        resultado.append("<P>Valor total pago: <EM>R$ ").append(cliente.getValorTotal())
                .append("</EM>").append(fimDeLinha);
        resultado.append("<P>Voce acumulou <EM>")
                .append(cliente.getPontosTotaisDeAlugadorFrequente())
                .append(" pontos </EM> de alugador frequente");
        return resultado.toString();
    }
}