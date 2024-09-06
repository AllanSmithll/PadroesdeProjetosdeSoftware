package view;

import model.EnqueteEvent;
import model.EnqueteListener;
import model.EnqueteSimples;

public class TelaResultadoPercentual implements EnqueteListener {
    @Override
    public void novoVoto(EnqueteEvent evento) {
        exibirResultadoPercentual(evento.getEnquete());
    }

    @Override
    public void novaOpcao(EnqueteEvent evento) {
        exibirResultadoPercentual(evento.getEnquete());
    }

    private void exibirResultadoPercentual(EnqueteSimples enquete) {
        int totalVotos = enquete.getTotalVotos();
        if (totalVotos == 0) return;

        System.out.println("\n--- Resultado da Enquete (Percentual) ---");
        enquete.getOpcoes().forEach((opcao, votos) -> {
            double percentual = (votos / (double) totalVotos) * 100;
            System.out.println(opcao + ": " + String.format("%.2f", percentual) + "%");
        });
    }
}

