import model.*;

public class Locadora {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Allan");
        cliente.adicionarAluguel(new Aluguel(new DVDInfantil("Frozen"), 5));

        Extrato extratoTela = new ExtratoTela(cliente);
        System.out.println(extratoTela.gerarExtrato());

        Extrato extratoHTML = new ExtratoHTML(cliente);
        System.out.println(extratoHTML.gerarExtrato());
    }
}