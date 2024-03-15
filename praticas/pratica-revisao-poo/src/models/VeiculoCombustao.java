package models;
import java.util.ArrayList;

public class VeiculoCombustao extends Veiculo {
    private ArrayList<COMBUSTIVEL> tipos_combustiveis = new ArrayList<>();

    public VeiculoCombustao(String marca, String modelo, double autonomia, double capacidade_tanque,
                            double combustivel_disponivel, ArrayList<COMBUSTIVEL> combustiveis) {
        super(marca, modelo, autonomia, capacidade_tanque, combustivel_disponivel);
        this.tipos_combustiveis = combustiveis;
    }

    public ArrayList<COMBUSTIVEL> getTiposCombustiveis() {
        return this.tipos_combustiveis;
    }
}