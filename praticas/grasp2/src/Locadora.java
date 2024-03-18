import model.Aluguel;
import model.Cliente;
import model.DVD;
import model.TipoClassificacao;

public class Locadora {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Alex Sandro");
        c1.adicionarAluguel(new Aluguel(new DVD("O Atirador", TipoClassificacao.NORMAL), 10));
        c1.adicionarAluguel(new Aluguel(new DVD("Luca", TipoClassificacao.INFANTIL), 2));
        c1.adicionarAluguel(new Aluguel(new DVD("O Gato de Botas 2",
                TipoClassificacao.LANCAMENTO), 30));
        c1.adicionarAluguel(new Aluguel(new DVD("Arremessando Alto",
                TipoClassificacao.LANCAMENTO), 4));
        c1.adicionarAluguel(new Aluguel(new DVD("Moana", TipoClassificacao.INFANTIL), 10));
        c1.adicionarAluguel(new Aluguel(new DVD("Uma Noite no Museu",
                TipoClassificacao.NORMAL), 3));
        System.out.println(c1.extrato());
    }
}