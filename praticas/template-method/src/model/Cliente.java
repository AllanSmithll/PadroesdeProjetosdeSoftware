package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Aluguel> dvdsAlugados = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Aluguel> getDvdsAlugados() {
        return dvdsAlugados;
    }

    public void adicionarAluguel(Aluguel aluguel) {
        dvdsAlugados.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;
        while (alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
            resultado += "\t" + cada.getDVD().getTitulo() + "\t R$ " +
                    cada.calcularValor() + fimDeLinha;
        }
        resultado += "Valor total pago: R$ " + getValorTotal() + fimDeLinha;
        resultado += "Voce acumulou " + getPontosTotaisDeAlugadorFrequente() +
                " pontos de alugador frequente";
        return resultado;
    }

    public String extratoHTML() {
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
        String resultado = "<H1>Registro de Alugueis de <EM>" +
                getNome() + "</EM></H1><P>" + fimDeLinha;
        while (alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
            resultado += cada.getDVD().getTitulo() + ": R$ " +
                    cada.calcularValor() + "<BR>" + fimDeLinha;
        }
        resultado += "<P>Valor total pago: <EM>R$ " + getValorTotal() +
                "</EM>" + fimDeLinha;
        resultado += "<P>Voce acumulou <EM>" +
                getPontosTotaisDeAlugadorFrequente() +
                " pontos </EM> de alugador frequente";
        return resultado;
    }

    public double getValorTotal() {
        double total = 0;
        for (Aluguel aluguel : dvdsAlugados) {
            total += aluguel.calcularValor();
        }
        return total;
    }

    public int getPontosTotaisDeAlugadorFrequente() {
        int pontos = 0;
        for (Aluguel aluguel : dvdsAlugados) {
            pontos++;
            if (aluguel.ehDVDBonus() && aluguel.getDiasAlugado() > 1) {
                pontos++;
            }
        }
        return pontos;
    }
}