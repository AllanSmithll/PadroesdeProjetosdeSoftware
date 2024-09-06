package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnqueteSimples {
    private List<EnqueteListener> listeners = new ArrayList<>();
    private Map<String, Integer> opcoes = new HashMap<>();

    public void adicionarOpcao(String opcao) {
        opcoes.put(opcao, 0);
        disparaNovaOpcao(opcao);
    }

    public void votar(String opcao) {
        String opcaoLowerCase = opcao.toLowerCase();

        for (String key : opcoes.keySet()) {
            if (key.toLowerCase().equals(opcaoLowerCase)) {
                opcoes.put(key, opcoes.get(key) + 1);
                disparaNovoVoto(key);
                return;
            }
        }
    }

    public void addEnqueteListener(EnqueteListener listener) {
        listeners.add(listener);
    }

    private void disparaNovoVoto(String opcao) {
        EnqueteEvent evento = new EnqueteEvent(this, opcao);
        for (EnqueteListener listener : listeners) {
            listener.novoVoto(evento);
        }
    }

    private void disparaNovaOpcao(String opcao) {
        EnqueteEvent evento = new EnqueteEvent(this, opcao);
        for (EnqueteListener listener : listeners) {
            listener.novaOpcao(evento);
        }
    }

    public Map<String, Integer> getOpcoes() {
        return opcoes;
    }

    public int getTotalVotos() {
        return opcoes.values().stream().mapToInt(Integer::intValue).sum();
    }
}
