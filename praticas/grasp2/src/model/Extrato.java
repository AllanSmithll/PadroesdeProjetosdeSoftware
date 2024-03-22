package model;

import java.util.Iterator;
import java.util.List;

public class Extrato {
    public static String gerarExtrato(Cliente cliente) {
        final String fimDeLinha = System.getProperty("line.separator");

        double valorTotal = 0.0;

        int pontosDeAlugadorFrequente = 0;

        List<Aluguel> alugueis = cliente.getDvdsAlugados();
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + cliente.getNome() +
                fimDeLinha);

        for (Aluguel aluguel : alugueis) {
            double valorCorrente = 0.0;

            valorCorrente += aluguel.calcularValor();

            pontosDeAlugadorFrequente++;

            // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
            if (aluguel.ehDVDBonus() && aluguel.getDiasAlugado() > 1) {
                pontosDeAlugadorFrequente++;
            }

            // mostra valores para este aluguel
            resultado.append("\t").append(aluguel.getDVD().getTitulo()).append("\t").append(valorCorrente).append(fimDeLinha);
            valorTotal += valorCorrente;
        }

        // adiciona rodapé
        resultado.append("Valor total devido: ").append(valorTotal).append(fimDeLinha);
        resultado.append("Você acumulou ").append(pontosDeAlugadorFrequente).append(" pontos de alugador frequente");

        return resultado.toString();
    }
}