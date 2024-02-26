package models;
public class VeiculoEletrico extends Veiculo {
    public VeiculoEletrico(String marca, String modelo, double autonomia, double capacidade_tanque,
                           double combustivel_disponivel) {
        super(marca, modelo, autonomia, capacidade_tanque, combustivel_disponivel);
    }
}