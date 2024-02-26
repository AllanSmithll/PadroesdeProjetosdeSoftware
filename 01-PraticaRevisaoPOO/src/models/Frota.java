package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos = new ArrayList<>();

    public List<Veiculo> getVeiculos() {
        return this.veiculos;
    }

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
        for (Veiculo vc : var_veiculos) {
            if (vc instanceof VeiculoCombustao) veiculos_combustao.add((VeiculoCombustao) vc);
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

    public void abastecerVeiculosPorCombustao(COMBUSTIVEL combustivel, double quantidade_litros) throws Exception {
        for (Veiculo ve : this.veiculos) {
            if (ve instanceof VeiculoCombustao) {
                if (quantidade_litros <= 0) {
                    throw new Exception("Minimo de 1 litro para abastecer.");
                }
                if ((ve.getCombustivelDisponivel() + quantidade_litros) > ve.getCapacidadeTanque()) {
                    throw new Exception("Acima da capacidade permitida.");
                }
                ve.setCombustivelDisponivel(ve.getCombustivelDisponivel() + quantidade_litros);
            }
        }
    }

    public void recarregarVeiculosEletricos(double quantidade_watts) throws Exception {
        for (Veiculo ve : this.veiculos) {
            if (ve instanceof VeiculoEletrico) {
                if (quantidade_watts <= 0) {
                    throw new Exception("Minimo de 1 watt para abastecer.");
                }
                if ((ve.getCombustivelDisponivel() + quantidade_watts) > ve.getCapacidadeTanque()) {
                    throw new Exception("Acima da capacidade permitida.");
                }
                ve.setCombustivelDisponivel(ve.getCombustivelDisponivel() + quantidade_watts);
            }
        }
    }

//    public List<Veiculo> listarVeiculosComAutonomiaInferior(int porcentagem) {
//        List<Veiculo> resultados = new ArrayList<>();
//        for (Veiculo veiculo : this.veiculos) {
//            if (veiculo.getAutonomia() * porcentagem / 100 < veiculo.getAutonomia()) {
//                resultados.add(veiculo);
//            }
//        }
//        return resultados;
//    }
}
