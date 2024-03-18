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
        return Extrato.gerarExtrato(this);
    }
}