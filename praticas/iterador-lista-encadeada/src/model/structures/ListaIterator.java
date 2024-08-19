package model.structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaIterator implements Iterator<Object> {
    private ListaEncadeada.Node currentNode;

    public ListaIterator(ListaEncadeada.Node startNode) {
        this.currentNode = startNode;
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object data = currentNode.getObject();
        currentNode = currentNode.getProximo();
        return data;
    }
}
