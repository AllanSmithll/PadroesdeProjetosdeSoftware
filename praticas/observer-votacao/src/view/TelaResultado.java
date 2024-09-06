package view;

import model.EnqueteEvent;
import model.EnqueteListener;
import model.EnqueteSimples;

public class TelaResultado implements EnqueteListener {
    @Override
    public void novoVoto(EnqueteEvent evento) {
        exibirResultado(evento.getEnquete());
    }

    @Override
    public void novaOpcao(EnqueteEvent evento) {
        exibirResultado(evento.getEnquete());
    }

    private void exibirResultado(EnqueteSimples enquete) {
        System.out.println("\n--- Resultado da Enquete (Total de Votos) ---");
        enquete.getOpcoes().forEach((opcao, votos) ->
                System.out.println(opcao + ": " + votos + " votos")
        );
    }
}

