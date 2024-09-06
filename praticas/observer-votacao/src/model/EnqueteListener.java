package model;

public interface EnqueteListener {
    void novoVoto(EnqueteEvent evento);
    void novaOpcao(EnqueteEvent evento);
}
