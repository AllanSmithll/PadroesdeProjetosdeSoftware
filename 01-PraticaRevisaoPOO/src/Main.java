import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("SISTEMA DA FROTA DE VEÍCULOS\n");

        VeiculoCombustao v1 = new VeiculoCombustao("Wolkswagen", "Gol", 400.0, 500.0, 10.0, new ArrayList<>(Arrays.asList(COMBUSTIVEL.GASOLINA, COMBUSTIVEL.DIESEL)));
        VeiculoCombustao v2 = new VeiculoCombustao("Chevrolet", "Onix", 500.0, 510.0, 12.0, new ArrayList<>(Arrays.asList(COMBUSTIVEL.DIESEL, COMBUSTIVEL.FLEX)));
        VeiculoEletrico v3 = new VeiculoEletrico("aaaaaaaaa", "aaaa", 390.0, 499.0, 9.0);
        VeiculoEletrico v4 = new VeiculoEletrico("bbbbbbbbb", "bbbb", 410.0, 501.0, 13.0);
        VeiculoEletrico v5 = new VeiculoEletrico("ccccccccc", "cccc", 420.0, 498.0, 11.0);
        VeiculoEletrico v6 = new VeiculoEletrico("ddddddddd", "dddd", 420.0, 498.0, 11.0);
        VeiculoEletrico v7 = new VeiculoEletrico("ccccccccc", "cccc", 420.0, 498.0, 11.0);
        VeiculoEletrico v8 = new VeiculoEletrico("ccccccccc", "cccc", 420.0, 498.0, 11.0);
        VeiculoEletrico v9 = new VeiculoEletrico("ccccccccc", "cccc", 420.0, 498.0, 11.0);
        VeiculoEletrico v10 = new VeiculoEletrico("ccccccccc", "cccc", 420.0, 498.0, 11.0);
        VeiculoEletrico v11 = new VeiculoEletrico("ccccccccc", "cccc", 420.0, 498.0, 11.0);
        VeiculoEletrico v12 = new VeiculoEletrico("ccccccccc", "cccc", 420.0, 498.0, 11.0);
        VeiculoEletrico v13 = new VeiculoEletrico("ccccccccc", "cccc", 420.0, 498.0, 11.0);
        VeiculoEletrico v14 = new VeiculoEletrico("ccccccccc", "ccgc", 420.0, 498.0, 11.0);
        VeiculoEletrico v15 = new VeiculoEletrico("ccccccccc", "ccqc", 420.0, 498.0, 11.0);
        VeiculoEletrico v16 = new VeiculoEletrico("ccccccccc", "ccwc", 420.0, 498.0, 11.0);
        VeiculoEletrico v17 = new VeiculoEletrico("ccccccccc", "ccec", 420.0, 498.0, 11.0);
        VeiculoEletrico v18 = new VeiculoEletrico("ccccccccc", "cccc", 420.0, 498.0, 11.0);
        VeiculoEletrico v19 = new VeiculoEletrico("ccccccccc", "cccc", 420.0, 498.0, 11.0);
        VeiculoEletrico v20 = new VeiculoEletrico("ccccccccc", "cccc", 420.0, 498.0, 11.0);

        Veiculo[] lista_veiculos = {v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,
                                    v11,v12,v13,v14,v15,v16,v17,v18,v19,v20};
        Frota f1 = new Frota();
        for (Veiculo v : lista_veiculos) {
            f1.adicionarVeiculo(v);
        }

        // 10 veiculos com maior autonomia de rodagem
        System.out.println("Veiculos mais autonomos:");
        List<Veiculo> maiores_autonomias = f1.maioresAutonomias(10);
        for (Veiculo ve : maiores_autonomias) System.out.println(ve.getMarca()+"-"+ve.getModelo()+"-"+ve.getAutonomia());

        // 10 veiculos com menor autonomia de rodagem
        System.out.println("\nVeiculos menos autonomos:");
        List<Veiculo> menores_autonomias = f1.menoresAutonomias(10);
        for (Veiculo ve : menores_autonomias) System.out.println(ve.getMarca()+"-"+ve.getModelo()+"-"+ve.getAutonomia());

        // Veiculos que sao movidos a combustivel fossil ou eletrico
        System.out.println("\nMovidos a combustivel fossil:");
        List<VeiculoCombustao> veiculos_combustao = f1.veiculosACombustao();
        for (VeiculoCombustao ve : veiculos_combustao) System.out.println(ve.getMarca()+"-"+ve.getModelo()+"-"+ve.getAutonomia()+"-"+ve.getTiposCombustiveis());

        System.out.println("\nMovidos a combustivel eletrico:");
        List<VeiculoEletrico> veiculos_eletricos = f1.veiculosEletricos();
        for (VeiculoEletrico ve : veiculos_eletricos) System.out.println(ve.getMarca()+"-"+ve.getModelo()+"-"+ve.getAutonomia());
    }
}