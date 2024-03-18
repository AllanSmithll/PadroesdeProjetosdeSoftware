package model;

public class Extrato {

    public static String gerarExtrato(Cliente cliente) {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;

        // Calcula o valor total e os pontos de fidelidade para cada aluguel
        for (Aluguel aluguel : cliente.getDvdsAlugados()) {
            valorTotal += aluguel.calcularValor();
            pontosDeAlugadorFrequente += calcularPontos(aluguel);
        }

        // Gera o extrato
        String resultado = "Registro de Alugueis de " + cliente.getNome() + fimDeLinha;
        for (Aluguel aluguel : cliente.getDvdsAlugados()) {
            resultado += "\t" + aluguel.getDVD().getTitulo() + "\t" + aluguel.calcularValor() + fimDeLinha;
        }
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Você acumulou " + pontosDeAlugadorFrequente + " pontos de alugador frequente";
        return resultado;
    }

    private static int calcularPontos(Aluguel aluguel) {
        int pontos = 1;

        // Regras para pontuação de acordo com o tipo de DVD e dias alugados
        if (aluguel.getDVD().getTipoClassificacao() == TipoClassificacao.LANCAMENTO &&
                aluguel.getDiasAlugado() > 1) {
            pontos++;
        }

        return pontos;
    }
}