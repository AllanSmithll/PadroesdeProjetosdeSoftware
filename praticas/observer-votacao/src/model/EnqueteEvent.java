package model;

public class EnqueteEvent {
    private String opcao;
    private EnqueteSimples enquete;

    public EnqueteEvent(EnqueteSimples enquete, String opcao) {
        this.enquete = enquete;
        this.opcao = opcao;
    }

    public String getOpcao() {
        return opcao;
    }

    public EnqueteSimples getEnquete() {
        return enquete;
    }
}

