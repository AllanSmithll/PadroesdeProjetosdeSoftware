package controller;

import model.EnqueteSimples;

public class TelaVotacaoCtrl {
    private EnqueteSimples enquete;

    public TelaVotacaoCtrl(EnqueteSimples enquete) {
        this.enquete = enquete;
    }

    public void registrarVoto(String opcao) {
        enquete.votar(opcao);
    }
}

