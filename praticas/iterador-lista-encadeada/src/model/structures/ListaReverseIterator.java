package model.structures;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

class ListaReverseIterator implements Iterator<Object> {
    private final Stack<Object> pilha = new Stack<>();

    public ListaReverseIterator(ListaEncadeada.Node startNode) {
        ListaEncadeada.Node currentNode = startNode;

        while (currentNode != null) {
            pilha.push(currentNode.getObject());
            currentNode = currentNode.getProximo();
        }
    }

    @Override
    public boolean hasNext() {
        return !pilha.isEmpty();
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return pilha.pop();
    }
}