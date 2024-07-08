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