import model.EnqueteSimples;
import view.TelaResultado;
import view.TelaResultadoPercentual;
import view.TelaVotacao;

public class Main {
    public static void main(String[] args) {
        EnqueteSimples enquete = new EnqueteSimples();
        TelaResultado telaResultado = new TelaResultado();
        TelaResultadoPercentual telaPercentual = new TelaResultadoPercentual();

        enquete.addEnqueteListener(telaResultado);
        enquete.addEnqueteListener(telaPercentual);

        enquete.adicionarOpcao("Java");
        enquete.adicionarOpcao("Python");
        enquete.adicionarOpcao("JavaScript");

        TelaVotacao telaVotacao = new TelaVotacao(enquete);
        telaVotacao.exibir();
    }
}
