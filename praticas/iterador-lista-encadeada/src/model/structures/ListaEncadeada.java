// Classe Node e definicao da Classe Lista
package model.structures;

import java.util.Iterator;

// Definicao da Classe List
public class ListaEncadeada  {
    public Node primeiroNode; // apontador para o primeiro No
    public Node ultimoNode;   // apontador para o ultimo NO
    public String desc;  // String como "lista" usado na impressao

    public class Node {
        // O pacote acessa dado de modo que a classe List pode acessa-lo diretamente
        public Object dado;
        public Node proximo;

        /** Constructor: Cria um Node que referencia o Object o.  */
        public Node( Object o ) {
            this( o, null );
        }

        /** Constructor: Cria um Node que referencia o Object o e
         o proximo Node da Lista.  */
        public Node( Object o, Node proximoNode )
        {
            dado    = o;          // esse noh referencia o Object o
            proximo = proximoNode; // Configura next para referenciar o proximo Node
        }

        /** Retorna uma referencia ao Object desse Node  */
        public Object getObject() {
            return dado;
        }

        /** Retorna o proximo Node  */
        public Node getProximo() {
            return proximo;
        }
    }



    /** Constructor: Constroi uma Lista vazia com "s" como nome  */
    public ListaEncadeada( String s )
    {
        this.desc = s;
        primeiroNode = ultimoNode = null;
    }

    /** Constructor: Constroi uma lista vazia com "lista" como nome */
    public ListaEncadeada() {
        this( "Unknown" );
    }

    // Insere um Object na frente da Lista.
    // Se a Lista estiver vazia, primeiroNode e ultimoNode irao referenciar
    // o mesmo objeto.  Caso contrario, primeiroNode referencia o novo Node.
    public synchronized void inserirNaFrente( Object insertItem )
    {
        if ( estaVazia() )
            primeiroNode = ultimoNode = new Node( insertItem );
        else
            primeiroNode = new Node( insertItem, primeiroNode );
    }

    // Insere um Objeto no final da Lista
    // Se a lista estiver vazia, primeiroNode e ultimoNode irao referenciar
    // o mesmo objeto. Caso contrario, a proxima variavel de instancia de ultimoNode
    // referencia o novo Node
    public synchronized void inserirNoFinal( Object insertItem )
    {
        if ( estaVazia() )
            primeiroNode = ultimoNode = new Node( insertItem );
        else
            ultimoNode = ultimoNode.proximo = new Node( insertItem );
    }

    // Remove o primeiro Node da Lista
    public synchronized Object removeDaFrente() throws ListaVaziaException {
        Object itemRemovido = null;

        if ( estaVazia() )
            throw new ListaVaziaException( this.desc );

        itemRemovido = primeiroNode.dado;  // retrieve the data

        // redefine as referencias de primeiroNode e ultimoNode
        if ( primeiroNode.equals( ultimoNode ) )
            primeiroNode = ultimoNode = null;
        else
            primeiroNode = primeiroNode.proximo;

        return itemRemovido;
    }

    // Remove o ultimo Node da Lista
    public synchronized Object removeDoFinal() throws ListaVaziaException
    {
        Object itemRemovido = null;

        if ( estaVazia() )
            throw new ListaVaziaException( this.desc );

        itemRemovido = ultimoNode.dado;  // recupera o dado

        // redefine as referencias para primeiroNode e ultimoNode
        if ( primeiroNode.equals( ultimoNode ) )
            primeiroNode = ultimoNode = null;
        else {
            Node corrente = primeiroNode;

            while ( corrente.proximo != ultimoNode )  // nao ultimo Node
                corrente = corrente.proximo;      // move o proximo Node

            ultimoNode = corrente;
            corrente.proximo = null;
        }

        return itemRemovido;
    }

    // Retorna true se a Lista estiver vazia
    public synchronized boolean estaVazia() {
        return primeiroNode == null;
    }

    // Emite o conteudo da Lista
    public synchronized String toString() {
        Node corrente = primeiroNode;
        String ret = "";

        if ( estaVazia() ) {
            return ("{}");
        }

        // ret += "A " + this.nome + " �: \n";

        while ( corrente != null ) {
            ret += corrente.dado.toString() + "\n";
            corrente = corrente.proximo;
        }

        return ret;
    }



    /** Pesquisa pela primeira ocorr�ncia do Node */
    public boolean localizaNode(Object obj) {
        Node corrente = this.primeiroNode;
        boolean encontrado = false;

        while (corrente != null) {
            if (corrente.dado.equals(obj)) {
                encontrado = true;
                break;
            } else
                corrente = corrente.proximo;
        }
        return (encontrado);
    }

    public Iterator<Object> iterator() {
        return new ListaIterator(primeiroNode);
    }

    public Iterator<Object> reverseIterator() {
        return new ListaReverseIterator(primeiroNode);
    }
}