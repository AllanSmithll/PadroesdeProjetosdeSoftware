import model.structures.ListaEncadeada;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirNaFrente("Iterator");
        lista.inserirNaFrente("Strategy");
        lista.inserirNaFrente("State");
        lista.inserirNaFrente("Abstract Factory");

        System.out.println("Iteração na ordem natural:");
        Iterator<Object> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nIteração na ordem reversa:");
        Iterator<Object> reverseIterator = lista.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}