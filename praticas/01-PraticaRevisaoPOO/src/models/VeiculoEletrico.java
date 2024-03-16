package models;
public class VeiculoEletrico extends Veiculo {
    public VeiculoEletrico(String marca, String modelo, double autonomia, double capacidade_bateria,
                           double combustivel_disponivel) {
        super(marca, modelo, autonomia, capacidade_bateria, combustivel_disponivel);
    }
}