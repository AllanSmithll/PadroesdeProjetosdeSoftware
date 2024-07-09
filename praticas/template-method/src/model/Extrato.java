package model;

import java.util.Iterator;

public abstract class Extrato {
    protected Cliente cliente;

    public Extrato(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() { return this.cliente; }

    public Cliente setCliente(Cliente cliente) { return this.cliente = cliente; }

    protected abstract String getCabecalho(String nomeCliente);

    protected abstract String getSeparadorDeLinha();

    protected abstract String formatarAluguel(String tituloDVD, double valor);

    protected abstract String getRodape(double valorTotal, int pontosTotais);

    public final String gerarExtrato() {
        final String fimDeLinha = this.getSeparadorDeLinha();
        StringBuilder resultado = new StringBuilder(
                this.getCabecalho(this.cliente.getNome().toUpperCase())).append(fimDeLinha);

        double valorTotal = 0.0;

        int pontosDeAlugadorFrequente = 0;

        Iterator<Aluguel> alugueis = this.cliente.getDvdsAlugados().iterator();

        while (alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
            double valorCorrente = cada.calcularValor();

            pontosDeAlugadorFrequente++;

            if (cada.ehDVDBonus() && cada.getDiasAlugado() > 1) {
                pontosDeAlugadorFrequente++;
            }
            resultado.append(formatarAluguel(cada.getDVD().getTitulo(), cada.calcularValor()));
            valorTotal += valorCorrente;
        }

        resultado.append(getRodape(valorTotal, pontosDeAlugadorFrequente));

        return resultado.toString();
    }

}
