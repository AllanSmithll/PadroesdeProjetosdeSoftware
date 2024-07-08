package model;

public abstract class Extrato {
    protected Cliente cliente;

    public Extrato(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract String gerarExtrato();
}
