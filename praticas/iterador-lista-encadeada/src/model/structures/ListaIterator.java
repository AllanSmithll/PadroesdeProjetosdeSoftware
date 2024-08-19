package model.structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaIterator implements Iterator<Object> {
    private ListaEncadeada.Node noAtual;

    public ListaIterator(ListaEncadeada.Node startNode) {
        this.noAtual = startNode;
    }

    @Override
    public boolean hasNext() {
        return noAtual != null;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object data = noAtual.getObject();
        noAtual = noAtual.getProximo();
        return data;
    }
}
