package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v) {
        this.veiculos.add(v);
    }

    // Veículos com maiores autonomias
    public List<Veiculo> maioresAutonomias(int quantidade) {
        // Ordenacao primeiro
        List<Veiculo> veiculos_sort = this.veiculos;
        veiculos_sort.sort(Comparator.comparing(Veiculo::getAutonomia).reversed());

        // Quantidade depois
        return veiculos_sort.subList(0, quantidade);
    }

    public List<Veiculo> menoresAutonomias(int quantidade) {
        // Ordenacao primeiro
        List<Veiculo> veiculos_sort = this.veiculos;
        veiculos_sort.sort(Comparator.comparing(Veiculo::getAutonomia));

        // Quantidade depois
        return veiculos_sort.subList(0, quantidade);
    }

    public List<VeiculoCombustao> veiculosACombustao() {
        List<Veiculo> var_veiculos = this.veiculos;
        List<VeiculoCombustao> veiculos_combustao = new ArrayList<>();
        for (Veiculo ve : var_veiculos) {
            if (ve instanceof VeiculoCombustao) veiculos_combustao.add((VeiculoCombustao) ve);
        }
        return veiculos_combustao;
    }

    public List<VeiculoEletrico> veiculosEletricos() {
        List<Veiculo> var_veiculos = this.veiculos;
        List<VeiculoEletrico> veiculos_eletricos = new ArrayList<>();
        for (Veiculo ve : var_veiculos) {
            if (ve instanceof VeiculoEletrico) veiculos_eletricos.add((VeiculoEletrico) ve);
        }
        return veiculos_eletricos;
    }
}
