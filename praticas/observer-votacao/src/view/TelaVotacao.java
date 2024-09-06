package view;

import controller.TelaVotacaoCtrl;
import model.EnqueteSimples;

import java.util.Scanner;

public class TelaVotacao {
    private EnqueteSimples enquete;
    private TelaVotacaoCtrl controlador;

    public TelaVotacao(EnqueteSimples enquete) {
        this.enquete = enquete;
        this.controlador = new TelaVotacaoCtrl(enquete);
    }

    public void exibir() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha uma opção para votar (ou digite 'sair' para encerrar):");
            for (String opcao : enquete.getOpcoes().keySet()) {
                System.out.println(opcao);
            }
            String voto = scanner.nextLine();

            if (voto.equalsIgnoreCase("encerrar")) {
                System.out.println("Enquete encerrada.");
                break;
            }

            enquete.votar(voto);
        }
    }
}

