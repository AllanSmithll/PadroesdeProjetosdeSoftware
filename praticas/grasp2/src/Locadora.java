import model.*;

public class Locadora {


    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alex Sandro");

        c1.adicionarAluguel(new Aluguel(new DVDNormal("O Atirador"), 10));
        c1.adicionarAluguel(new Aluguel(new DVDInfantil("Luca"), 2));
        c1.adicionarAluguel(new Aluguel(new DVDLancamento("O Gato de Botas 2"), 30));

        c1.adicionarAluguel(new Aluguel(new DVDLancamento("Arremessando Alto"), 4));
        c1.adicionarAluguel(new Aluguel(new DVDInfantil("Moana"), 10));

        c1.adicionarAluguel(new Aluguel(new DVDNormal("Uma Noite no Museu"), 3));

        System.out.println(c1.extrato());
    }
}