package model;

public class ExtratoTela extends Extrato {
    public ExtratoTela(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String gerarExtrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + cliente.getNome() + fimDeLinha);
        for (Aluguel aluguel : cliente.getDvdsAlugados()) {
            resultado.append("\t").append(aluguel.getDVD().getTitulo()).append("\t R$ ")
                    .append(aluguel.calcularValor()).append(fimDeLinha);
        }
        resultado.append("Valor total pago: R$ ").append(cliente.getValorTotal()).append(fimDeLinha);
        resultado.append("Voce acumulou ").append(cliente.getPontosTotaisDeAlugadorFrequente())
                .append(" pontos de alugador frequente");
        return resultado.toString();
    }
}